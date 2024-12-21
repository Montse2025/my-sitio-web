/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda_leng2.pkg5989216;

/**
 *
 * @author Montse Brizuela
 */
public class Libros {
      String titulo;
      String autor;
      int Nejemplares;
      int NejemplaresPrestado;     
     
      
      

      public Libros () {
	    this.titulo = "Alicia en el pais de las maravillas";
	    this.autor = "Montse Brizuela";
	    this.Nejemplares = 50;
	    this.NejemplaresPrestado = 0;
	    
      }
      
     
      public Libros (String titulo, String autor, int Nejemplares, int NejemplaresPrestado) {
	    this.titulo = titulo;
	    this.autor = autor;
	    this.Nejemplares = Nejemplares;
	    this.NejemplaresPrestado = NejemplaresPrestado;
      }

      public String getTitulo () {
	    return titulo;
      }

      public void setTitulo (String Ti) {
	    titulo = Ti;
      }

      public String getAutor () {
	    return autor;
      }

      public void setAutor (String au) {
	    autor = au;
      }

      public int getNejemplares () {
	    return Nejemplares;
      }

      public void setNejemplares (int Ne) {
	    Nejemplares = Ne;
      }

      public int getNejemplaresPrestado () {
	    return NejemplaresPrestado;
      }

      public void setNejemplaresPrestado (int Np) {
	    NejemplaresPrestado = Np;
      }
      
 public String visualizar (){
       return "Titulo del Libro: " +this.titulo +"\n"
		 + "Autor del Libro: " +this.autor +"\n"
		 + "Nro. Ejemplares Libro: " +this.Nejemplares + "\n"
		 + "Nro. Ejemplares Prestados: " + this.NejemplaresPrestado;
 }
 
 public boolean prestar(){
       
       boolean prestado = false;
       if(Nejemplares>0){
	    NejemplaresPrestado++;
	    Nejemplares--;
	    prestado = true;
       }
       return prestado;
 }
}
