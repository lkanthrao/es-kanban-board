package net.chrisrichardson.eventstore.examples.kanban.common.task.model;

/**
 * Created by popikyardo on 08.01.16.
 */
public class ChangeTaskStatusRequest {
    private String boardId;

    public ChangeTaskStatusRequest() {
    }

    public ChangeTaskStatusRequest(String boardId) {
        this.boardId = boardId;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }
}
