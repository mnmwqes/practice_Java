package array_11;

class Quere {
    char[] q;
    int putloc, getloc;


    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь переполнена.");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if(putloc == getloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QDemo {
    public static void main(String[] args) {
        int i, ch;

        for(i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));

        for(i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

        for(i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }

        for(i = 0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }

    }
}