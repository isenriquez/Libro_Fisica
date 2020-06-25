/*
Diseñe e implemente un único constructor que permita gestionar los datos de la
clase, además, implemente sus respectivos métodos get() y set() correspondientes
para cada atributo; además, implemente el método toString() para mostrar la información
relativa a la clase Libro_Fisica.
En la clase principal main(), diseñe e implemente 3 objetos que lleven el nombre
de la clase Libro_Fisica, con valores considerados para la presente aplicación y
muestre por pantalla. Finalmente, implemente la versión de prueba en Git Hub-Atom.

 */
package libro_fisicaapp;

/**
 *
 * @author cliente
 */
class Libro_Fisica{

    //creo atributos
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;

    //implemento constructor
    public Libro_Fisica(int eCodigo, String eTitulo, String eAutor, int eAnio_Edicion){

        codigo=eCodigo;
        titulo=eTitulo;
        autor=eAutor;
        anio_edicion=eAnio_Edicion;


    }
        //implemento los METODOS
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo=codigo; //puntero this
    }
    public String getTitulo(){
        return titulo;
    }
     public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public int getAnio_Edicion(){
        return anio_edicion;
    }
    public void setAnio_Edicion(int anio_edicion){
        this.anio_edicion=anio_edicion;
    }
     @Override
     public String toString(){
        return "El libro"+titulo+" del autor "+autor+"fue editado y publicado en "+anio_edicion+
                "el cual tiene el siguiente codigo "+codigo+"";
    }
}
public class Libro_FisicaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    //creo los objetos
    Libro_Fisica libro1=new Libro_Fisica(12020,"Fisica Vectorial","Ing. P. Ayala y Mcsc. J.Zambrano ", 2010);
    Libro_Fisica libro2=new Libro_Fisica(2020,"Mecanica Vectorial para ingenieros", "FERDINAND,E. RUSSELL ,F. MAZUREK y R. EISENBERG", 2010);
    Libro_Fisica libro3=new Libro_Fisica(3020,"Fisica para ciencias e ingenieria", "Raymond A. Serway y John W. Jewett, Jr. ", 2008);

   //Imprimo
    System.out.println(libro1.toString());
    System.out.println(libro2.toString());
    System.out.println(libro3.toString());
    }

 }
