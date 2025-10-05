package array_11;

class Queue {
    char[] q;
    int putloc, getloc;

    Queue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    void put(char ch) {
        if(putloc == q.length) {
            System.out.println("");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if(getloc == putloc) {
            System.out.println("");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("");
        //
        for(i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));


    }
}