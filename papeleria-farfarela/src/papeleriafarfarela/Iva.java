package papeleriafarfarela;


import java.util.*;

/** @pdOid dc4af713-2c0a-4863-bd64-3470a199e636 */
public class Iva {
   /** @pdOid 85f62375-8e0e-4e84-85cd-0a45032b2344 */
   public double ivaId;
   /** Valor del iva, ejm: 12 que pertenece al 12% o 14 que pertenece al 14%
    * 
    * @pdOid 9761570e-f4da-464d-9e77-a8753644bc2a */
   public double ivaValor;
   
   /** Asociación entre tabla IVA y ARTICULOS */
   public java.util.Collection fechaiva;

}