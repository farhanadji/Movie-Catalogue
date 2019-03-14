package picodiploma.dicoding.favorite.database;

import android.net.Uri;
import android.provider.BaseColumns;

public class DatabaseContract {

    public static String AUTHORITY = "picodiploma.dicoding.submission5";
    public static Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);
    public static String TABLE_FAVORITE = "favorite";

    static final class FavoriteColumns implements BaseColumns {
        public static String MOVIE_ID = "movie_id";
        public static String TITLE = "title";
        public static String RELEASE_DATE = "release_date";
        public static String OVERVIEW = "overview";
        public static String POSTER_PATH = "poster_path";
        public static String BACKDROP_PATH = "backdrop_path";

    }

    public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon()
            .appendPath(TABLE_FAVORITE)
            .build();
}
