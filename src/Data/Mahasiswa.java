package Data;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mahasiswa {
    private JComboBox cbhari;
    private JComboBox cbbulan;
    private JButton proses;
    private JTextField tfnama;
    private JComboBox cbtahun;
    private JPanel main;
    private JTextArea tralamat;
    private JLabel lbnama;
    private JLabel lbtanggalLahir;
    private JLabel lblamat;
    private JLabel lbusia;
    private JPanel secondmain;

    public JPanel getMain() {
        return main;
    }

    public Mahasiswa() {
        proses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biodata biodata = new Biodata();
                biodata.setNama(tfnama.getText());
                biodata.setTanggalLahir(
                        Integer.parseInt((String) cbtahun.getSelectedItem()),
                        cbbulan.getSelectedIndex() + 1,
                        Integer.parseInt((String) cbhari.getSelectedItem())
                );
                biodata.setAlamat(tralamat.getText());

                lbnama.setText(biodata.getNama());
                lbtanggalLahir.setText(": " + biodata.getTanggalLahir());
                lblamat.setText(": " + biodata.getAlamat());
                lbusia.setText(": " + biodata.getUsia());
            }
        });
    }
}
