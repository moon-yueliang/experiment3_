package experiment3_7;

public class OpenCommand extends Command{
    private BoardScreen boardScreen;
    public OpenCommand(BoardScreen boardScreen) {
        super();
        this.boardScreen = boardScreen;
    }

    @Override
    public void execute() {
        boardScreen.open();
    }
}
