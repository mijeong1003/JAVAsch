import javax.swing.*;
import java.awt.*;
public class Practice6 extends JFrame{


    private String [] fruits= {"apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry"};
    private String [] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
    private ImageIcon [] images = { new ImageIcon("1.png"), new ImageIcon("2.png"), new ImageIcon("3.png"), new ImageIcon("4.png") };
	public Practice6() {
		setTitle("(�ֹ���) Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));
		c.add(new JButton("��ư"));
		
		
		ImageIcon cherryIcon=new ImageIcon("cherry.jpg");
		ImageIcon selectedCherryIcon =new ImageIcon("selectedCherry.jpg");
		JCheckBox apple=new JCheckBox("���");
		JCheckBox pear=new JCheckBox("��",true);
		JCheckBox cherry=new JCheckBox("ü��",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		ButtonGroup g=new ButtonGroup();
		JRadioButton apple1=new JRadioButton("���");
		JRadioButton pear1=new JRadioButton("��",true);
		JRadioButton cherry1=new JRadioButton("ü��",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		g.add(apple1);
		g.add(pear1);
		g.add(cherry1);
		c.add(apple1);
		c.add(pear1);
		c.add(cherry1);
		
		
		JSlider slider=new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		c.add(slider);
		
		
		c.add(new JLabel("�̸� "));
		c.add(new JTextField(20));
		c.add(new JLabel("�а� "));
		c.add(new JTextField("��ǻ�Ͱ��а�",20));
		c.add(new JLabel("�ּ� "));
		c.add(new JTextField("����� ...",20));
		
		
	    c.add(new JLabel("Enter the password : "));
		c.add(new JTextField(20));
		
		

		String week[]=new String[]{"January","February","March","Aprile","May","June","July","August","September","October","November","December"};
		c.add(new JLabel("Month:"));
		c.add(new JSpinner(new SpinnerListModel(week)));


		JTextField textfield = new JTextField(20);
		JTextArea textarea = new JTextArea(7, 20);
		c.add(new JScrollPane(textarea));

		 
  		JComboBox<String> strCombo=new JComboBox<String>(fruits);
	    c.add(strCombo);
	    JComboBox<String> nameCombo=new JComboBox<String>();
	    for(int i=0; i<names.length; i++) {
	    	nameCombo.addItem(names[i]);
	    }
	    c.add(nameCombo);
	    
		
	   JList<String> strList = new JList<String>(fruits);
       c.add(strList);
       JList<ImageIcon> imageList = new JList<ImageIcon>();
       imageList.setListData(images);
       c.add(imageList);
       JList<String> scrollList = new JList<String>(fruits);
       c.add(new JScrollPane(scrollList)); 

		
		setSize(1000,700);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Practice6();
	}
}
