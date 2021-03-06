/*
 * Main.java
 *
 * Created on __DATE__, __TIME__
 */

package com.huiyu.frame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JFileChooser;
import javax.swing.UIManager;

import com.huiyu.analysis.Start;
import com.huiyu.utils.GetSortNum;

/**
 *
 * @author  __USER__
 */
public class Main extends javax.swing.JFrame {
	Start m = new Start();
	IsNumberOrChar n = new IsNumberOrChar();

	/** Creates new form Main */
	public Main() {
		initComponents();
		get();
		this.setTitle("词法分析");
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("\u5f00\u59cb\u5206\u6790");
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				try {
					jButton1MouseClicked(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jScrollPane2.setViewportView(jTextArea2);

		jLabel1.setText("\u539f\u53e5\u5b50\u6216\u53e5\u6bb5\uff1a");

		jLabel2.setText("\u8bcd\u6cd5\u5206\u6790\u540e\u7684\u7ed3\u679c\uff1a");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jScrollPane2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				267,
																				Short.MAX_VALUE)
																		.addGap(12,
																				12,
																				12)
																		.addComponent(
																				jButton1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addGap(282,
																				282,
																				282)))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel2)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																262,
																javax.swing.GroupLayout.PREFERRED_SIZE))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGap(7, 7, 7)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(jLabel2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																287,
																Short.MAX_VALUE)
														.addComponent(
																jScrollPane2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																287,
																Short.MAX_VALUE))
										.addGap(67, 67, 67))
						.addGroup(
								jPanel1Layout.createSequentialGroup()
										.addGap(169, 169, 169)
										.addComponent(jButton1)
										.addContainerGap(192, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	public void get() {
		String strs = Begin.jTextArea1.getText();
		this.jTextArea2.append(strs);

	}

	private void jButton1MouseClicked(java.awt.event.MouseEvent evt)
			throws IOException {
		
		String newstrs = this.jTextArea2.getText();
		List<String >list=new ArrayList<String>();
	    StringReader sr = new StringReader(newstrs);   
		BufferedReader bf=new BufferedReader(sr);
		String strLine=bf.readLine();
		while(strLine!=null){
			System.out.println("strLine:"+strLine);
			list.add(strLine);
			strLine=bf.readLine();
		}
		bf.close();
		sr.close();
		String[] list1 = null;
		for (int i = 0; i < list.size(); i++) {
			jTextArea1.append("进行第" + (i + 1) + "行的判断：" + "\r\n");
	        list1 = m.Divide(list.get(i));
			Sort(list1);

		}
	}

	/**
	 * @param args the command line arguments
	 */
	public void Sort(String[] list) {
		//map里面的key有word,sortNum
		List<Map> mList = new ArrayList<Map>();
		//获取经过处理的种别码和关键字系列集合
		mList = n.GetStringAndSortNum(list);

		for (Map m0 : mList) {
			String keyword = (String) m0.get("keyword");
			String str = (String) m0.get("sortNum");
			Integer sortNum = Integer.valueOf(str);
			String name = "";
			if ((7 > sortNum) && (sortNum > 0)) {
				name = "是关键字类型 ";

			} else if ((sortNum == 11) || (sortNum.equals("11"))) {
				name = "是数字类型";

			} else if ((sortNum == 10) || (sortNum.equals("10"))) {
				name = "是字符类型";

			} else if ((21 > sortNum) && (sortNum > 12)) {
				name = "是单目运算符类型";

			} else if ((25 > sortNum) && (sortNum > 20)) {
				name = "是双目运算符类型";

			}

			else if ((30 > sortNum) && (sortNum > 24)) {
				name = "是终结符类型";

			} else {
				name = "是未识别类型";
			}

			jTextArea1.append("(" + sortNum + "," + keyword + ")   " + keyword
					+ "的种别码是" + sortNum + "," + name + " " + "\r\n");
		}
	}

	public static void main(String args[]) {
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	public class IsNumberOrChar {
		GetSortNum g = new GetSortNum();

		/**
		 * 将按间隔符分好的list进行判断，判断是否是合法的子串
		 * @param list
		 * @return
		 */
		@SuppressWarnings("rawtypes")
		public List<Map> GetStringAndSortNum(String[] list) {
			char firstChar;//用于记录第一个首字符
			String keyword = "", sortNum = "";//需要输出返回的关键字，种别码
			String cType, word;//第一个首字符的类型

			//mlist用于返回整个List判断完成后的含有的字符和种别码
			List<Map> mList = new ArrayList<Map>();

			for (int i = 0; i < list.length; i++) {
				Map<String, String> map = new HashMap<String, String>();//m用于保存最后返回的已经判别成功的字和种别码
				//word代表需要进行处理判断的字
				word = list[i];
				//判断word是不是空的串，因为有可能根据空格分割的串中有空的换行符或者空串，不进行处理
				if (word == "" || word == null || word.trim() == "")
					continue;

				firstChar = word.charAt(0);
				//获取这个字符的类型
				cType = GetCharType(firstChar);

				if (cType == "letter") {
					if (firstChar == 'w' || firstChar == 'i'
							|| firstChar == 'b' || firstChar == 'd'
							|| firstChar == 'e' || firstChar == 't') {
						//获得keyword词
						Map<String, String> m = new HashMap<String, String>();//m用于保存最后返回的已经判别成功的字和种别码
						m = GetKeyWord(word);
						//取出m的值，如果是关键字
						if (m != null) {
							keyword = m.get("keyword");
							sortNum = m.get("sortNum");
						}
						//不是关键字，但是包含关键字的前一个字符串
						else {
							if (IsID(word)) {
								keyword = word;
								sortNum = g.getSortNum("ID") + "";
							} else {
								jTextArea1.append("这个" + word
										+ "不是合法的字符类型，所在的位置在：第" + (i + 1)
										+ "个单词" + "\r\n");
							}
						}
					} else {//首字母为字符，但是需要进一步判断是不是合法的ID
						if (IsID(word)) {
							keyword = word;
							sortNum = g.getSortNum("ID") + "";
						} else {
							jTextArea1.append("这个" + word
									+ "不是合法的字符类型，所在的位置在：第" + (i + 1) + "个单词"
									+ "\r\n");
						}
					}
				}
				if (cType == "digit") {
					if (IsNum(word)) {
						keyword = word;
						sortNum = g.getSortNum("NUM") + "";
					} else {
						jTextArea1.append("这个" + word + "不是合法的数字类型，所在的位置在：第"
								+ (i + 1) + "个单词" + "\r\n");
					}
				}
				if (cType == "opts") {
					//获取这个word的长度，如果是一个进行单运算符的判断，如果是2进行多运算符的判断
					int len = word.length();
					if (len == 1) {
						if (IsSingleOpt(word)) {
							keyword = word;
							sortNum = g.getSortNum(word) + "";
						} else if (IsEndOpt(word)) {
							keyword = word;
							sortNum = g.getSortNum(word) + "";
						} else {
							jTextArea1.append("这个" + word
									+ "不是合法的数字类型，所在的位置在：第" + (i + 1) + "个单词"
									+ "\r\n");
						}
					} else if (len == 2) {
						if (IsDoubleOpt(word)) {
							keyword = word;
							sortNum = g.getSortNum(word) + "";
						} else {
							jTextArea1.append("这个" + word
									+ "不是合法的数字类型，所在的位置在：第" + (i + 1) + "个单词"
									+ "\r\n");
						}
					} else {
						jTextArea1.append("这个" + word + "不是合法的数字类型，所在的位置在：第"
								+ (i + 1) + "个单词" + "\r\n");
					}
				}
				if (keyword.equals("") || sortNum.equals("") || keyword == ""
						|| sortNum == "")
					continue;
				else {
					map.put("keyword", keyword);
					map.put("sortNum", sortNum);
					mList.add(map);
					keyword = "";
					sortNum = "";
				}
			}
			return mList;
		}

		/**
		 * 根据字符判断这个字符是什么类型
		 * @param c
		 * @return
		 */
		public String GetCharType(char c) {
			String type = "";

			//('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') || ('0' <= ch && ch <= '9');
			if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')) {
				type = "letter";
			} else if ('0' <= c && c <= '9') {
				type = "digit";
			} else {
				type = "opts";
			}
			return type;
		}

		/**
		 * 判断从现在index开始是否是关键字
		 * @param String word
		 * @return Map<String,String>
		 */
		public Map<String, String> GetKeyWord(String word) {
			Map<String, String> m = new HashMap<String, String>();
			char firstChar = word.charAt(0);
			switch (firstChar) {
			case 'b':
				if (word == "begin" || word.equals("begin")) {
					String sortNum = g.getSortNum(word) + "";
					m.put("sortNum", sortNum);
					m.put("keyword", "begin");
				}
				break;

			case 'i':
				if (word == "if" || word.equals("if")) {
					String sortNum = g.getSortNum(word) + "";
					m.put("sortNum", sortNum);
					m.put("keyword", "if");
				}
				break;

			case 't':
				if (word == "then" || word.equals("then")) {
					String sortNum = g.getSortNum(word) + "";
					m.put("sortNum", sortNum);
					m.put("keyword", "then");
				}
				break;

			case 'w':
				if (word == "while" || word.equals("while")) {
					String sortNum = g.getSortNum(word) + "";
					m.put("sortNum", sortNum);
					m.put("keyword", "while");
				}
				break;

			case 'd':
				if (word == "do" || word.equals("do")) {
					String sortNum = g.getSortNum(word) + "";
					m.put("sortNum", sortNum);
					m.put("keyword", "do");
				}
				break;

			case 'e':
				if (word == "end" || word.equals("end")) {
					String sortNum = g.getSortNum(word) + "";
					m.put("sortNum", sortNum);
					m.put("keyword", "end");
				}
				break;
			}
			return m;
		}

		/**
		 * 判断一个字符是不是合法的ID,如果是，则返回true，否则，返回这个word的错误码false
		 * @param string word
		 * @return boolean
		 */
		public boolean IsID(String word) {
			char c;
			char firstChar = word.charAt(0);//获取第一个字符

			if (GetCharType(firstChar) == "letter") {//判断第一个字符是不是letter，否则肯定不是合法的
				for (int i = 1; i < word.length(); i++) {//从第二个字符开始
					c = word.charAt(i);
					if (GetCharType(c) == "letter")//如果是letter,下一个字符
						continue;
					else if (GetCharType(c) == "digit")//如果是digit,下一个字符
						continue;
					else
						//否则报错
						return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * 判断一个串是不是合法的digit
		 * @param word
		 * @return
		 */
		public boolean IsNum(String word) {
			char c;
			char firstChar = word.charAt(0);//获取第一个字符

			if (GetCharType(firstChar) == "digit") {//判断第一个字符是不是digit，否则肯定不是合法的
				for (int i = 1; i < word.length(); i++) {//从第二个字符开始
					c = word.charAt(i);
					if (GetCharType(c) == "digit")//如果是digit,下一个字符
						continue;
					else
						//否则报错
						return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * 判断是否是双目运算符
		 * @param word
		 * @return
		 */
		private boolean IsDoubleOpt(String word) {
			String optDouble[] = { ":=", "<=", "<>", ">=" };//双目运算符
			for (int i = 0; i < optDouble.length; i++)
				if (word.equals(optDouble[i]))
					return true;
			return false;
		}

		/**
		 * 判断是否是单目运算符
		 * @param word
		 * @return
		 */
		private boolean IsSingleOpt(String word) {
			char optSingle[] = { '+', '-', '*', '/', '<', '>', '=' };//单目运算符
			for (int i = 0; i < optSingle.length; i++)
				if (word.equals(optSingle[i] + ""))
					return true;
			return false;
		}

		/**
		 * 判断是否是终结符
		 * @param word
		 * @return
		 */
		private boolean IsEndOpt(String word) {
			char End[] = { ':', ';', '(', ')', '#' };//终结符
			for (int i = 0; i < End.length; i++)
				if (word.equals(End[i] + ""))
					return true;
			return false;
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	// End of variables declaration//GEN-END:variables

}