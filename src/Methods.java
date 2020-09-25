import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

public class Methods {
    int[] rateList = {3,7,7};
    static List<News> newsList = new ArrayList<>();

    public void add(News news){
        newsList.add(news);
    }

    public void show() {
        for (News news : newsList
        ) {
            news.display();
        }
    }

   public float Calculate() {
        News news = new News();
        float total = 0 ;
        for (int i = 0; i < rateList.length; i++) {
            total = total + rateList[i];

        }
        news.averageRate = total / rateList.length;
        return news.averageRate ;
    }
}
