package experiment3_7;

public class CreateCommand extends Command {
    private BoardScreen boardScreen;

    public CreateCommand(BoardScreen boardScreen) {
        super();
        this.boardScreen = boardScreen;

    }

    @Override

    public void execute() {
        boardScreen.create();

    }

}
