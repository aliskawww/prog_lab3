import Actions.*;
import Characters.*;
import Interfaces.IActions;
import Places.*;
import Stuff.Distracted;
import Stuff.Distraction;
import Stuff.Terrible;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Distraction bds = new Distraction(100);
        Persons bud = new Buddies("Buddies");
        Persons buk = new Bukovka("Bukovka", bds);
        Persons lib = new Librarian("Librarian");
        Persons nez = new Neznaika("Neznaika");
        Persons shor = new Shorties("Shorties");
        Distraction lds = new Distraction(100);
        Persons lis = new Listik("Listik", lds);

        Actions app = new Appeared();
        Actions bus = new Busy();
        Actions cns = new Cant_say();
        Actions chok = new Choked();
        Actions com = new Comfort();
        Actions des = new Describe();
        Actions des2 = new Describe2();
        Actions dis = new Disappeared();
        Actions dob = new Doubt();
        Actions eyes = new Eyes_action();
        Actions fin = new Find();
        Actions head = new Head_action();
        Actions look = new Looked();
        Actions read = new Read_on_walk();
        Actions ret = new Returned();
        Actions rid = new Ride();
        Actions ridec = new Ride_call();
        Actions said = new Said_that();
        Actions saw = new Saw();
        Actions send = new Send_a_message();
        Actions start = new Started_to_read();
        Actions tim = new Timescip();
        Actions brek = new To_break();
        Actions hop = new To_hop_on();
        Actions took = new Took_book();
        Actions touch = new Touched();
        Actions view = new Viewers_wait();
        Actions wait = new Wait();
        Actions wak = new Waked();
        Actions walk = new Walked_around();
        Actions was = new Was_here();

        Places book = new Book_theatre("Книжный театр");
        Places cross = new Crossroad("Перекресток");
        Places gar = new Garden("Сквер");
        Places hos = new Hospital("Больница");
        Places hous = new House("Дом");
        Places libr = new Library("Библиотека");
        Places pol = new Police("Полиция");
        Places str = new Street("Улица");

        ArrayList<Actions> query = new ArrayList<>();
        query.add(wait);
        query.add(was);
        query.add(look);
        query.add(tim);
        query.add(took);
        query.add(bus);
        query.add(view);
        query.add(start);
        query.add(cns);
        query.add(dis);
        query.add(dob);
        query.add(head);
        query.add(eyes);
        query.add(chok);
        query.add(com);
        query.add(read);
        query.add(ret);
        query.add(hop);
        query.add(brek);
        query.add(touch);
        query.add(rid);
        query.add(ridec);
        query.add(fin);
        query.add(send);
        query.add(app);
        query.add(said);
        query.add(wak);
        query.add(saw);
        query.add(des);
        query.add(walk);
        query.add(des2);

        int index = 0;
        if(rand.nextInt(0, 100) < 10) {
            throw new Terrible("Все хорошо");
        }

        System.out.println("Однажды " + lis.writeActSolo("пошел в ") + libr.getName());
        System.out.println(lis.writeActDuo("сказал что на обратном пути зайдет к", buk));
        System.out.println("а потом они вместе пойдут в " + book.getName());
        System.out.println(buk.writeActSolo(query.get(index).executeAction()));
        index++;
        System.out.println(lis.writeActSolo("почему-то не появился"));
        System.out.println("Сначала " + buk.writeActSolo("подумала, что он задержался в ") + libr.getName());
        System.out.println(buk.writeActSolo("начала беспокоиться и решила выйти на ") + str.getName());
        try {
            buk.setDistraction(bds.subDistraction(rand.nextInt(120)));
            if(buk.getDistraction().lost()) {
                throw new Distracted("Потерял сознание");
            }
        } catch (Distracted e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println(buk.writeActSolo("дошла до самой " + libr.getName()));
        System.out.println(buk.writeActDuo("так и не встретила", lis));
        System.out.println("Когда " + buk.getName() + " пришла в" + libr.getName() + " то " + lib.writeActSolo("сказала что ") + lis.writeActSolo(query.get(index).executeAction()) + " взял книгу про удивительные приключения гусенка Яшки, после чего ушел.");
        index++;
        System.out.println(buk.writeActSolo("подумала что ") + lis.writeActDuo("забыл о том, что обещал зайти к", buk));
        System.out.println(buk.writeActSolo("пошла к нему домой, ") + lis.writeActSolo("дома тоже не оказалось. "));
        System.out.println(buk.writeActSolo("решила, что ") + lis.writeActDuo("встретился на улице с кем-нибудь из", bud));
        System.out.println("Вернувшись " + hous.getName() + buk.writeActDuo(" стала ждать", lis));
        System.out.println(buk.writeActSolo(query.get(index).executeAction()) + " но" + lis.writeActSolo("не появлялся"));
        index++;
        System.out.println(query.get(index).executeAction());
        index++;
        System.out.println(buk.writeActSolo(query.get(index).executeAction()));
        index++;
        System.out.println(buk.writeActSolo("отправилась в ") + book.getName());
        System.out.println("У " + buk.writeActDuo("оставалась надежда что туда тоже придет", lis));
        System.out.println("Но когда " + buk.writeActSolo("пришла в ") + gar.getName() + " то увидела что " + lis.writeActSolo("нет там"));
        System.out.println(query.get(index).executeAction());
        index++;
        System.out.println(buk.writeActSolo("знала что ") + query.get(index));
        index++;
        System.out.println(buk.writeActSolo(query.get(index).executeAction()));
        index++;
        System.out.println(buk.writeActSolo(query.get(index).executeAction()));
        index++;
        System.out.println("Каждый вечер за этим столом " + lis.writeActSolo(query.get(index).executeAction()));
        index++;
        System.out.println(buk.writeActSolo(query.get(index).executeAction()) + "что случилось какое-нибудь несчастье.");
        index++;
        System.out.println(query.get(index).executeAction());
        index++;
        System.out.println(query.get(index).executeAction());
        index++;
        System.out.println(shor.writeActDuo("удивились, увидев, что плачет", buk));
        System.out.println("Все окружили " + buk.getName() + " стали спрашивать, что случилось.");
        System.out.println(buk.writeActSolo(query.get(index).executeAction()) + " рассказала что " + lis.getName() + "пропал.");
        index++;
        System.out.println(query.get(index).executeAction() + " говоря, что он, наверно, найдется.");
        index++;
        System.out.println(buk.writeActSolo("не утешалась. "));
        try {
            buk.setDistraction(bds.subDistraction(rand.nextInt(30)));
            if(buk.getDistraction().lost()) {
                throw new Distracted("Потерял сознание");
            }
        } catch (Distracted e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        System.out.println(buk.writeActSolo("сказала, что ") + lis.writeActSolo("очень рассеянный и к тому же ") + query.get(index).executeAction());
        index++;
        System.out.println(query.get(index).executeAction());
        index++;
        System.out.println(lis.writeActSolo(query.get(index).executeAction()));
        index++;
        System.out.println(query.get(index).executeAction());
        index++;
        System.out.println("На " + cross.getName() + lis.writeActSolo("мог по рассеянности переходить улицу при красном светофоре и попасть под какой-нибудь автомобиль\n" +
                "или труболет, которые носятся по городу с такой бешеной скоростью, что не успевают даже затормозить. "));
        System.out.println(shor.writeActSolo(query.get(index).executeAction()));
        index++;
        System.out.println(shor.writeActSolo(query.get(index).executeAction()) + "потому что если на улице произойдет какой-нибудь случай,\n" +
                "то пострадавший обязательно должен попасть или в больницу, или в милицию. ");
        index++;
        System.out.println("Скоро" + shor.writeActSolo(query.get(index).executeAction()) + "но ");
        index++;
        System.out.println(lis.writeActSolo(query.get(index).executeAction()));
        index++;
        System.out.println("Каждое отделение милиции выделило\n" +
                "по нескольку милиционеров для поисков " + lis.getName() + "Поиски продолжались всю ночь, но не дали никаких результатов. ");
        System.out.println("Тогда " + query.get(index).executeAction());
        index++;
        System.out.println(query.get(index).executeAction());
        index++;
        System.out.println("в которой была напечатана\n" +
                "вся эта история про " + lis.getName() + "и " + buk.getName());
        System.out.println(query.get(index).executeAction());
        index++;
        System.out.println("Утром " + nez.writeActSolo(query.get(index).executeAction()) + "Во сне ему стало казаться, будто поблизости зажужжала пчела или\n" +
                "начал работать шкаф-пылесос. ");
        index++;
        System.out.println("Открыв глаза, " + nez.writeActSolo(query.get(index).executeAction()) + " С виду она напоминала собой\n" +
                "черепаху: такая же полукруглая в верхней части и плоская внизу.");
        index++;
        System.out.println(nez.writeActSolo(query.get(index).executeAction()));
        index++;
        System.out.println(query.get(index).executeAction());
    }
}