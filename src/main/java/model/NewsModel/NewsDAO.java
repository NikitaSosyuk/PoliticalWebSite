package model.NewsModel;

import java.util.List;

public interface NewsDAO {
    List<News> getAllNews();
    List<News> getNewsByConsignmentId(int consignment_id);
}
