package ea6;

public class Philosoph extends Thread {
   String name;
   Zustand zustand = Zustand.SCHLAFEND;
   Staebchen rechts, links;

   public Philosoph(String name, Staebchen rechts, Staebchen links) {
      this.links = links;
      this.rechts = rechts;
      this.name = name;
      start();
   }

   public void run() {
      // was ein Phil halt tut
      while (true) {
         switch (zustand) {
         case SCHLAFEND:
            try {
               System.out.println(name + ": zzzzzz...");
               sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            zustand = Zustand.HUNGRIG;
            break;
         case HUNGRIG:
            // versucht die Stäbchen zu greifen
            System.out.println(name + ": grummel...");
            links.werdeGenommen();
            rechts.werdeGenommen();
            zustand = Zustand.ESSEND;
            break;
         case ESSEND:
            try {
               System.out.println(name + ": omnomnomnom");
               sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            links.werdeFrei();
            rechts.werdeFrei();
            zustand = Zustand.SCHLAFEND;
            break;

         default:
            break;
         }

      }

   }
}
