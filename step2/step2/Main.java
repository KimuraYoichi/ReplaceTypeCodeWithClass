package step2;
public class Main {
    public static void main(String[] args) {
        Item book = new Item(
            ItemType.BOOK,
            "���E�̗��j",
            4800);

        Item dvd = new Item(
            ItemType.DVD,
            "�j���[���[�N�̖��E���ʔ�",
            3000);

        Item soft = new Item(
            ItemType.SOFTWARE,
            "�`���[�����O�}�V���G�~�����[�^",
            3200);

        System.out.println("book = " + book.toString());
        System.out.println("dvd  = " + dvd.toString());
        System.out.println("soft = " + soft.toString());
    }
}
