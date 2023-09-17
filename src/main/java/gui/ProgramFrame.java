package gui;

import domain.listeners.ListenerKeyHold;
import domain.generators.PasswordGenerator;
import domain.generators.PasswordGeneratorImpl;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

/**
 * Класс приложения
 *
 * @autor Pycukvsu
 */
public class ProgramFrame extends JFrame {
    private JPanel mainPanel;
    private JPanel panel2;
    private JButton button;
    private JTextField tfPhrase;
    private JTextArea taPassword1;
    private JTextArea taKeyHold;
    private JCheckBox cbUpperCase;
    private JCheckBox cbSpecialSigns;
    private JCheckBox cbNumbers;
    private JTextField thPasswordLength;
    private JButton jButton2;
    private final PasswordGenerator passwordGenerator = new PasswordGeneratorImpl();

    public void showKeyHold(String averageKeyHold) {
        taKeyHold.setText(averageKeyHold);
    }

    public ProgramFrame() {

        ListenerKeyHold listenerKeyHold = new ListenerKeyHold(ProgramFrame.this);
        tfPhrase.addKeyListener(listenerKeyHold);
        setContentPane(mainPanel);
        setTitle("Password Generator");
        setSize(320, 450);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String passwordLength;

                // Если длина пароля не указана, то по дефолту она будет равна 10
                if ((passwordLength = thPasswordLength.getText()).equals("")) {
                    passwordLength = "10";
                }

                taPassword1.setText(passwordGenerator.generatePassword(Integer.parseInt(passwordLength),
                        cbNumbers.isSelected(),
                        cbSpecialSigns.isSelected(), cbUpperCase.isSelected()));
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Обнуление счетчика
                listenerKeyHold.resetTheCounter();
                tfPhrase.setText("");
                taKeyHold.setText("");
            }
        });

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        mainPanel.setBackground(new Color(-4342339));
        mainPanel.setForeground(new Color(-15329770));
        mainPanel.setInheritsPopupMenu(true);
        mainPanel.setPreferredSize(new Dimension(300, 450));
        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout(0, 0));
        panel2.setAutoscrolls(false);
        panel2.setBackground(new Color(-4342339));
        panel2.setPreferredSize(new Dimension(300, 70));
        panel2.setRequestFocusEnabled(false);
        mainPanel.add(panel2);
        final JLabel label1 = new JLabel();
        label1.setAlignmentY(0.0f);
        label1.setAutoscrolls(true);
        label1.setBackground(new Color(-4342339));
        label1.setEnabled(true);
        label1.setFocusable(false);
        Font label1Font = this.$$$getFont$$$("Courier New", Font.BOLD, 18, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-15329770));
        label1.setHorizontalAlignment(0);
        label1.setHorizontalTextPosition(0);
        label1.setText("Генератор паролей");
        label1.setVerifyInputWhenFocusTarget(false);
        label1.setVerticalAlignment(0);
        label1.setVerticalTextPosition(0);
        panel2.add(label1, BorderLayout.CENTER);
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel1.setBackground(new Color(-4342339));
        panel1.setPreferredSize(new Dimension(300, 75));
        mainPanel.add(panel1);
        taPassword1 = new JTextArea();
        Font taPassword1Font = this.$$$getFont$$$("Courier New", -1, -1, taPassword1.getFont());
        if (taPassword1Font != null) taPassword1.setFont(taPassword1Font);
        taPassword1.setPreferredSize(new Dimension(200, 25));
        panel1.add(taPassword1);
        button = new JButton();
        button.setBackground(new Color(-7368817));
        button.setHorizontalAlignment(0);
        button.setPreferredSize(new Dimension(140, 30));
        button.setText("Сгенерировать");
        button.setVerticalAlignment(0);
        panel1.add(button);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel3.setBackground(new Color(-4342339));
        panel3.setPreferredSize(new Dimension(300, 30));
        mainPanel.add(panel3);
        final JLabel label2 = new JLabel();
        label2.setBackground(new Color(-4342339));
        Font label2Font = this.$$$getFont$$$("Courier New", -1, 14, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-15329770));
        label2.setText("Длина пароля");
        panel3.add(label2);
        thPasswordLength = new JTextField();
        Font thPasswordLengthFont = this.$$$getFont$$$("Courier New", -1, -1, thPasswordLength.getFont());
        if (thPasswordLengthFont != null) thPasswordLength.setFont(thPasswordLengthFont);
        thPasswordLength.setPreferredSize(new Dimension(150, 30));
        panel3.add(thPasswordLength);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel4.setBackground(new Color(-4342339));
        panel4.setPreferredSize(new Dimension(300, 190));
        mainPanel.add(panel4);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel5.setBackground(new Color(-4342339));
        panel5.setPreferredSize(new Dimension(300, 75));
        panel4.add(panel5);
        cbUpperCase = new JCheckBox();
        cbUpperCase.setBackground(new Color(-4342339));
        Font cbUpperCaseFont = this.$$$getFont$$$(null, -1, -1, cbUpperCase.getFont());
        if (cbUpperCaseFont != null) cbUpperCase.setFont(cbUpperCaseFont);
        cbUpperCase.setForeground(new Color(-15329770));
        cbUpperCase.setText("Верхний регистр");
        panel5.add(cbUpperCase);
        cbSpecialSigns = new JCheckBox();
        cbSpecialSigns.setBackground(new Color(-4342339));
        Font cbSpecialSignsFont = this.$$$getFont$$$(null, -1, -1, cbSpecialSigns.getFont());
        if (cbSpecialSignsFont != null) cbSpecialSigns.setFont(cbSpecialSignsFont);
        cbSpecialSigns.setForeground(new Color(-15329770));
        cbSpecialSigns.setText("Специальные знаки");
        panel5.add(cbSpecialSigns);
        cbNumbers = new JCheckBox();
        cbNumbers.setBackground(new Color(-4342339));
        Font cbNumbersFont = this.$$$getFont$$$(null, -1, -1, cbNumbers.getFont());
        if (cbNumbersFont != null) cbNumbers.setFont(cbNumbersFont);
        cbNumbers.setForeground(new Color(-15329770));
        cbNumbers.setText("Цифры");
        panel5.add(cbNumbers);
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$("Courier New", -1, 14, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-15329770));
        label3.setText("Парольная фраза");
        panel4.add(label3);
        tfPhrase = new JTextField();
        Font tfPhraseFont = this.$$$getFont$$$("Courier New", -1, -1, tfPhrase.getFont());
        if (tfPhraseFont != null) tfPhrase.setFont(tfPhraseFont);
        tfPhrase.setPreferredSize(new Dimension(150, 30));
        panel4.add(tfPhrase);
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$("Courier New", -1, 14, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-15329770));
        label4.setText("Удержание клавиш (мс)");
        panel4.add(label4);
        taKeyHold = new JTextArea();
        Font taKeyHoldFont = this.$$$getFont$$$("Courier New", -1, -1, taKeyHold.getFont());
        if (taKeyHoldFont != null) taKeyHold.setFont(taKeyHoldFont);
        taKeyHold.setPreferredSize(new Dimension(102, 25));
        taKeyHold.setWrapStyleWord(false);
        panel4.add(taKeyHold);
        jButton2 = new JButton();
        jButton2.setBackground(new Color(-7368817));
        jButton2.setHorizontalAlignment(0);
        jButton2.setPreferredSize(new Dimension(140, 30));
        jButton2.setText("Обнулить");
        jButton2.setVerticalAlignment(0);
        panel4.add(jButton2);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
