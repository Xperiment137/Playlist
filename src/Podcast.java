public class Podcast extends Cancion {
    private int minutos;
    private String nombre;
    private String autor;
    private String genero;
    private int puntuacion;
    private boolean todoslpublicos;

    public Podcast( int minutos,String nombre, String autor,String genero,int puntuacion,boolean todoslpublicos){
      super(minutos,nombre,autor,genero,puntuacion);
      this.todoslpublicos=todoslpublicos;
    }
    public  boolean gettodos()
    {
        return todoslpublicos;
    }





}
