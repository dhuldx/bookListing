package com.example.android.booklisting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import java.util.List;


public class BookAdapter extends ArrayAdapter<Book> {



    // Resource ID for the background color for this list of words

    private int mColorResourceId;

    /**
     * Create a new {@link BookAdapter} object.
     *
     * @param context     is the current context (i.e. Activity) that the adapter is being created in.
     * @param books is the list of {@link books}s to be displayed.
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);

    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Book currentBook = getItem(position);


        String bookImage = new String(currentBook.getBookImage());
        //Initializing the ImageView
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        Glide                .with(getContext())
                .load(bookImage)
                .centerCrop()
                .placeholder(android.R.drawable.alert_light_frame)
                .crossFade()
                .into(imageView);

        String location = new String(currentBook.getPublisher());
        TextView primaryLocation = (TextView) listItemView.findViewById(R.id.publisher);
        // Display the location of the current earthquake in that TextView
        primaryLocation.setText(location);


        // String authors = new String(currentEarthquake.getAuthors());
        //  TextView bookAuthors = (TextView) listItemView.findViewById(R.id.author);
        // Display the location of the current earthquake in that TextView
        //  bookAuthors.setText(authors);



        String authors = new String(currentBook.getAuthors());

        String replaceAuthors = authors.replace("[", "").replaceAll("]","");
        String formatAuthors = replaceAuthors.replace("\"","");
        // Find the TextView with view ID location
        TextView bookAuthors = (TextView) listItemView.findViewById(R.id.author);

        bookAuthors.setText(formatAuthors);









        // Create a new Date object from the time in milliseconds of the book
        String bookCategory = new String(currentBook.getCategories());

        String replaceCategory = bookCategory.replace("[", "").replaceAll("]","");
        String formatCategory = replaceCategory.replace("\"","");

        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        dateView.setText(formatCategory);




        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */




}
