package precourse.week_02.mission01.Question02;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BookExample {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Book> libraryA = new ArrayList<>();       // 원본
        ArrayList<Book> libraryA_1;                         // 깊은 복사
        ArrayList<Book> libraryB;                           // 얕은 복사

        addElements(libraryA);                              // 온마을(A) 도서관에 책 추가
        libraryA_1 = shallowCopyElements(libraryA);         // libraryA 값을 libraryA_1에 얕은 복사
        libraryB = deepCopyElements(libraryA);              // libraryA 값을 libraryB에 깊은 복사

        libraryA.get(2).renameBook("그 많던 싱아는 누가 다 먹었을까");
        libraryA.get(2).renameAuthor("박완서");

        libraryB.add(new Book("사피엔스", "유발 하라리"));

        bw.write("libraryA 출력: ");
        bw.newLine();
        for(int i=0; i<libraryA.size(); i++) {
            bw.write(libraryA.get(i).showBookInfo());
            bw.newLine();
        }

        bw.write("---------------------------------");
        bw.newLine();

        bw.write("libraryA_1 출력: ");
        bw.newLine();
        for(int i=0; i<libraryA_1.size(); i++) {
            bw.write(libraryA_1.get(i).showBookInfo());
            bw.newLine();
        }

        bw.write("---------------------------------");
        bw.newLine();

        bw.write("libraryB 출력: ");
        bw.newLine();
        for(int i=0; i<libraryB.size(); i++) {
            bw.write(libraryB.get(i).showBookInfo());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void addElements(ArrayList<Book> library) {                       // 온마을(A) 도서관에 책 추가

        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("이기적 유전자", "리처드 도킨즈"));
        library.add(new Book("자전거 도둑", "박완서"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("대변동", "제레드 다이아몬드"));
    }

    public static ArrayList<Book> shallowCopyElements(ArrayList<Book> libraryA) {   // A-1 도서관에 책 얕은 복사

        return new ArrayList<Book>(libraryA);
    }

    public static ArrayList<Book> deepCopyElements(ArrayList<Book> libraryA) {      // B 도서관에 책 깊은 복사

        ArrayList<Book> libraryB = new ArrayList<>();                               // 원래 이렇게 cast(?)를 해줘야 하는건가 ...? -> obj 형이니 캐스팅을 해줘야함
        for(int i=0; i<libraryA.size(); i++) {
            libraryB.add((Book) libraryA.get(i).clone());
        }

        return libraryB;
    }
}
