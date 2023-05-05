//package Test8_2;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
///**
// * @Author xhy
// * @Date 2023/4/17 16:48
// * @description: 练习
// * @Title: Ex8_2
// * @Package Test8_2
// */
//
//public class StudentScore {
//    public static void main(String[] args) {
//        loginDialog dlg = new loginDialog();
//        dlg.setVisible(true);
//    }
//}
//
//class MainWindow extends JFrame{  //主窗体
//
//    /**
//     * 回显录入成绩标签
//     */
//    static JLabel submit;
//
//    MainWindow(){
//        setTitle("学生成绩录入系统");
//        setBounds(400,200,200,120);
//        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//
//        //设置为不使用布局管理器
//        setLayout(null);
//        createMenu();
//        submit = new JLabel();
//        submit.setBounds(5,5,400,20);
//        add(submit);
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//                super.windowOpened(e);
//                exitSystem();
//            }
//        });
//    }
//
//    void exitSystem(){  //处理退出系统事件
//    int ret = JOptionPane.showConfirmDialog(this,"退出系统吗?","退出系统吗??",JOptionPane.YES_NO_CANCEL_OPTION);
//    if(ret == JOptionPane.YES_NO_CANCEL_OPTION){
//        System.exit(0);
//    }
//    }
//
//    void createMenu(){//创建菜单栏并添加到窗体顶部
//        JMenuBar mbar = new JMenuBar();
//        setJMenuBar(mbar);
//        //创建两个下拉式菜单并添加到菜单栏
//        JMenu m1 = new JMenu("系统管理");
//        JMenu m2 = new JMenu("成绩管理");
//        mbar.add(m1);
//        mbar.add(m2);
//
//        //创建菜单项并添加到相应的菜单下
//        JMenuItem mi11 = new JMenuItem("基本信息管理");
//        JMenuItem mi12 = new JMenuItem("修改密码");
//        JMenuItem mi13 = new JMenuItem("退出系统" );
//        mi11.setEnabled(false);
//        mi12.setEnabled(false);
//        m1.add(mi11);
//        m1.add(mi12);
//        m1.add(mi13);
//        //为退出系统菜单项添加事件
//        mi13.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                exitSystem();
//            }
//        });
//        JMenuItem mi21 = new JMenuItem("成绩录入");
//        JMenuItem mi22 = new JMenuItem("成绩查询");
//        mi22.setEnabled(false);
//        m2.add(mi21);
//        m2.add(mi22);
//        //为成绩录入菜单项添加事件
//        mi21.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                inputScore();
//            }
//        });
//    }
//
//    void inputScore() {
//        InputScoreDialog isd = new InputScoreDialog();
//        isd.setVisible(true);
//    }
//    static void setSubmit(String str){
//        submit.setText(str);
//    }
//}
//
//class InputScoreDialog extends JDialog{ //录入成绩对话框类
//    JComboBox name;
//    JTextField maths;
//    JComboBox english;
//
//InputScoreDialog(){
//    setTitle("成绩录入");
//    setBounds(500,250,240,180);
//    setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
//    setLayout(null);
//    setModal(true);
//    createGUIElements();
//}
//void createGUIElements(){
//    JLabel namelbl = new JLabel("姓名");
//    namelbl.setBounds(10,20,60,25);
//    add(namelbl);
//    JLabel mathslbl = new JLabel("数学");
//    mathslbl.setBounds(10,50,60,25);
//    add(namelbl);
//    }
//}