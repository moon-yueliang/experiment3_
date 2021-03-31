package experiment3_7;

public class EditCommand extends Command {
    private BoardScreen boardScreen;

    public EditCommand(BoardScreen boardScreen) {
        super();

        this.boardScreen = boardScreen;

    }

    @Override

    public void execute() {
        boardScreen.edit();

    }

}
