package model.CommentModel;

import java.util.List;

public interface CommentDAO {
    List<Comment> getListCommentsByConsignmentsId(int id);
    boolean saveComment(String text, String name, int consignment_id, int user_id);
}
