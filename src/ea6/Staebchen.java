package ea6;

public class Staebchen {

   boolean istVerfügbar = true;

   public synchronized void werdeGenommen() {

      if (istVerfügbar) {
         istVerfügbar = false;
      } else {
         try {
            wait();
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }

   }

   public synchronized void werdeFrei() {
      istVerfügbar = true;
      notify();
   }
}
