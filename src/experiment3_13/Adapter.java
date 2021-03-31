package experiment3_13;

public class Adapter extends Rendering {
    private RenderEngine renderEngine;

    public Adapter(RenderEngine renderEngine) {
        this.renderEngine = renderEngine;
    }
    @Override
    public void render() {
        renderEngine.otherRender();
    }
}
