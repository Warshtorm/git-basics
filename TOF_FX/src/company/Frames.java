package company;
import javax.swing.*;
import java.awt.*;

public class Frames {

    static JFrame getFrame() {
        JFrame Jframe = new JFrame() {};  // создаём объект окно
        Jframe.setVisible(true);  // видимость окна
        Jframe.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);  // выход из программы и закрытие формы
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        Jframe.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        return Jframe;

    }
}


