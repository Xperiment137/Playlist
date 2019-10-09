public class Cancion {
    private int minutos;
    private String nombre;
    private String autor;
    private String genero;
    private int puntuacion;


     public Cancion( int minutos,String nombre, String autor,String genero,int puntuacion){
         this.minutos=minutos;
         this.nombre=nombre;
         this.autor=autor;
         this.genero=genero;
         this.puntuacion=puntuacion;

     }
     public int getMinutos()
     {
         return minutos;
     }
     public String getNombre()
     {
         return nombre;
     }
public  String getAutor()
{
    return  autor;
}
public String getGenero()
{
    return genero;
}
public int getPuntuacion()
{
    return  puntuacion;
}

}
