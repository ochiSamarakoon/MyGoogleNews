package ninja.zilles.mygooglenews;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zilles on 3/14/17.
 */

public class NewsArticle implements Parcelable {
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }


    /* The code below this line was automatically generated by the Parcelable AndroidStudio plug-in
     *      https://github.com/mcharmas/android-parcelable-intellij-plugin
     *  See: http://corochann.com/fast-easy-parcelable-implementation-with-android-studio-parcelable-plugin-641.html
     *      for an explanation.
     */
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.author);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeString(this.url);
        dest.writeString(this.urlToImage);
        dest.writeString(this.publishedAt);
    }

    public NewsArticle() {
    }

    protected NewsArticle(Parcel in) {
        this.author = in.readString();
        this.title = in.readString();
        this.description = in.readString();
        this.url = in.readString();
        this.urlToImage = in.readString();
        this.publishedAt = in.readString();
    }

    public static final Creator<NewsArticle> CREATOR = new Creator<NewsArticle>() {
        @Override
        public NewsArticle createFromParcel(Parcel source) {
            return new NewsArticle(source);
        }

        @Override
        public NewsArticle[] newArray(int size) {
            return new NewsArticle[size];
        }
    };
}
