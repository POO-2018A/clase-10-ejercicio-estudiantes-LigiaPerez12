package estudiantes;

/**
 *
 * @author bayon
 */
public class Principal {
    public static void main(String[] args) {
       
       Estudiantes[] estudiantes = new Estudiantes[5];
       
       estudiantes[0] = new Estudiantes("Juan","Perez","1412151712"); //3 materias
       estudiantes[1] = new Estudiantes("Maria","Castro","1753425147"); //3 materias
       estudiantes[2] = new Estudiantes("Pedro","Benitez","1725041402"); // 3 materia
       estudiantes[3] = new Estudiantes("Jose","Salvador","1712024486"); //3 materias
       estudiantes[4] = new Estudiantes("Ana","Lopez","1712872496"); //1 materias
       
       
       String[] m  = {"m1","m3"};
       String[] m1 = {"m2","m3","m1"};
       String[] m2 = {"m5","m1","m3"};
       String[] m3 = {"m2","m3","m4"};
       String[] m4 = {"m4"};         
           
        estudiantes[0].setMaterias(m);
        estudiantes[1].setMaterias(m1);
        estudiantes[2].setMaterias(m2);
        estudiantes[3].setMaterias(m3);
        estudiantes[4].setMaterias(m4);   
         
        int materia1 = 0;
        int materia2 = 0;
        int materia3 = 0;
        int materia4 = 0;
        int materia5 = 0;
        
        System.out.println("INFORMACIÓN ESTUDIANTES");
        
        for(int i=0;i<5;i++){
            
         String [] materiasEstudiante = estudiantes[i].getMaterias();
         System.out.print("\n");
         System.out.println("   Estudiante "+ (i+1));
         System.out.println(" Nombre completo : " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido());
         System.out.println(" Cédula : " + estudiantes[i].getCedula());
         System.out.println(" Materias : ");
         for(int j=0;j <materiasEstudiante.length;j++){
            System.out.println(" "+ (j+1) +". " + materiasEstudiante[j]);
                if(materiasEstudiante[j]=="m1"){
                    materia1 = materia1 +1;
                }else if(materiasEstudiante[j]=="m2"){
                    materia2 = materia2 +1;
                }else if(materiasEstudiante[j]=="m3"){
                    materia3 = materia3 +1;
                }else if(materiasEstudiante[j]=="m4"){
                    materia4 = materia4 +1;
                }else if(materiasEstudiante[j]=="m5"){
                    materia5 = materia5 +1;
                }
            }
        }
           System.out.print("\n");
        
         System.out.println("  RESUMEN MATERIAS");
         System.out.println(" m1 : " + materia1 );
         System.out.println(" m2 : " + materia2 );         
         System.out.println(" m3 : " + materia3 );
         System.out.println(" m4 : " + materia4 );
         System.out.println(" m5 : " + materia5 );
    }
    
}
