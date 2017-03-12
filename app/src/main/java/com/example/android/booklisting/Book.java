package com.example.android.booklisting;

/**
 * Created by Anika Dhulipudi on 17/01/2017.
 */

public class Book {
    private String mBookImage;
    private String mTitle;
    private String mAuthors;
    private String mcategories;
    private String mPreviewLink;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param authors is the magnitude (size) of the earthquake
     * @param publisher is the city location of the earthquake
     * @param  categories is the time in milliseconds (from the Epoch) when the
     *  book happened
     */
    public Book(String bookImage, String publisher, String authors, String categories, String previewLink) {
        mBookImage= bookImage;
        mTitle = publisher;
        mAuthors = authors;
        mcategories = categories;
        mPreviewLink = previewLink;

    }
    // return place of earthquake
    public String getBookImage() {
        return mBookImage;
    }
    // return place of earthquake
    public String getPublisher() {
        return mTitle;
    }
    //return the magnitude for the earthquake
    public String getAuthors() {
        return mAuthors;
    }


    /**
     * Returns the time of the earthquake.
     */
    public String getCategories() {
        return mcategories;
    }
    //Return url

    public String getPreviewLink() {
        return mPreviewLink;
    }


    @Override
    public String toString() {
        return "Book{" +
                "mBookImage='" + mBookImage + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mAuthors='" + mAuthors + '\'' +
                ", mcategories='" + mcategories + '\'' +
                ", mPreviewLink='" + mPreviewLink + '\'' +
                '}';
    }

}
