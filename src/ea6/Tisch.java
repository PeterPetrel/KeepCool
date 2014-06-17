package ea6;

public class Tisch {

   Philosoph[] phil = new Philosoph[5];
   Staebchen[] staberl = new Staebchen[5];

   public Tisch() {
      for (int i = 0; i < 5; i++) {
         staberl[i] = new Staebchen();
      }
      for (int i = 0; i < 5; i++) {

         phil[i] = new Philosoph("Dr. " + i, staberl[(i + 4) % 5], staberl[i]);
      }
   }

   public static void main(String args[]) {
      new Tisch();
   }
}
