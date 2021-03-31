package experiment3_13;

public class Client {
    public static void main(String[] args) {
        Scene scene = new Scene();
        Rendering rendering1;
       // rendering1=new SurfaceRendering();
       //rendering1=new VolumeRendering();
        rendering1=new Adapter(new RenderEngine());
        scene.setRendering(rendering1);
        scene.render();
    }
}
