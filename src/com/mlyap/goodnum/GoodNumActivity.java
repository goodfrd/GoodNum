package com.mlyap.goodnum;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GoodNumActivity extends Activity {
	EditText m_et_inputnum;
	TextView m_tv_result;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		m_et_inputnum = (EditText) findViewById(R.id.edt_InputNum);
		m_tv_result = (TextView) findViewById(R.id.tv_result);
		m_et_inputnum.setInputType(EditorInfo.TYPE_CLASS_PHONE);

		Button btn_Clear = (Button) findViewById(R.id.btn_Clear);
		btn_Clear.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				m_et_inputnum.setText("");
			}
		});

		Button btn_Quit = (Button) findViewById(R.id.btn_Quit);
		btn_Quit.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		Button btn_OK = (Button) findViewById(R.id.btn_OK);
		btn_OK.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String m_str_inputnum = m_et_inputnum.getText().toString().trim();
				long num4 = Long.valueOf(m_str_inputnum).longValue();
				int r1 = (int)(num4 % 80);
				if (r1 == 0)
					r1 = 80;

				String[] gn = new String[81];
				gn[1] = "大展鸿图，可获成功：吉";
				gn[2] = "一盛一衰，劳而无功：凶";
				gn[3] = "蒸蒸日上，百事顺遂：吉";
				gn[4] = "坎坷前途，苦难折磨：凶";
				gn[5] = "生意欣荣，名利双收：吉";
				gn[6] = "天降幸运，可成大功：吉";
				gn[7] = "和气致祥，必获成功：吉";
				gn[8] = "贯彻志望，成功可期：吉";
				gn[9] = "独营无力，财利无望：凶";
				gn[10] = "空费心力，徒劳无功：凶";
				gn[11] = "稳健着实，必得人望：吉";
				gn[12] = "薄弱无力，谋事难成：凶";
				gn[13] = "天赋吉运，能得人望：吉";
				gn[14] = "是成是败，惟靠坚毅：凶";
				gn[15] = "大事成就，一定兴隆：吉";
				gn[16] = "成就大业，名利双收：吉";
				gn[17] = "有贵人助，可得成功：吉";
				gn[18] = "顺利昌隆，百事亨通：吉";
				gn[19] = "内外不合，障碍重重：凶";
				gn[20] = "历尽艰难，焦心忧劳：凶";
				gn[21] = "专心经营，善用智慧：吉";
				gn[22] = "怀才不遇，事不如意：凶";
				gn[23] = "名显四方，终成大业：吉";
				gn[24] = "须靠自力，能奏大功：吉";
				gn[25] = "天时地利，再得人格：吉";
				gn[26] = "波澜起伏，凌驾万难：凶";
				gn[27] = "一盛一衰，可守成功：凶带吉";
				gn[28] = "青云直上，才略奏功：吉";
				gn[29] = "吉凶参半，得失相伴：凶";
				gn[30] = "名利双收，大业成就：吉";
				gn[31] = "池中之龙，成功可望：吉";
				gn[32] = "智慧慎始，必可昌隆：吉";
				gn[33] = "灾难不绝，难望成功：凶";
				gn[34] = "中吉之数，进退保守：吉";
				gn[35] = "波澜重叠，常陷穷困：凶";
				gn[36] = "逢凶化吉，风调雨顺：吉";
				gn[37] = "名虽可得，利则难获：凶带吉";
				gn[38] = "光明坦途，指日可待：吉";
				gn[39] = "一盛一衰，浮沉不定：吉带凶";
				gn[40] = "天赋吉运，前途无限：吉";
				gn[41] = "事业不专，十九不成：吉带凶";
				gn[42] = "忍耐自重，转凶为吉：吉带凶";
				gn[43] = "事难遂愿，贪功好进：凶";
				gn[44] = "绿叶发枝，一举成名：吉";
				gn[45] = "坎坷不平，艰难重重：凶";
				gn[46] = "有贵人助，可成大业：吉";
				gn[47] = "名利俱全，繁荣富贵：吉";
				gn[48] = "遇吉则吉，遇凶则凶：凶";
				gn[49] = "吉凶互见，一成一败：吉带凶";
				gn[50] = "一盛一衰，浮沉不常：吉带凶";
				gn[51] = "雨过天青，即获成功：吉";
				gn[52] = "盛衰参半，先吉後凶：吉带凶";
				gn[53] = "虽倾全力，难望成功：凶";
				gn[54] = "外观隆昌，内隐祸患：吉带凶";
				gn[55] = "事与愿违，终难成功：凶";
				gn[56] = "努力经营，时来运转：吉";
				gn[57] = "浮沉多端，始凶终吉：凶带吉";
				gn[58] = "遇事犹疑，难望成事：凶";
				gn[59] = "心迷意乱，难定方针：凶";
				gn[60] = "云遮半月，百隐风波：吉带凶";
				gn[61] = "烦闷懊恼，事事难展：凶";
				gn[62] = "万物化育，繁荣之象：吉";
				gn[63] = "十九不成，徒劳无功：凶";
				gn[64] = "吉运自来，能享盛名：吉";
				gn[65] = "内外不和，信用缺乏：凶";
				gn[66] = "事事如意，富贵自来：吉";
				gn[67] = "不失先机，可望成功：吉";
				gn[68] = "动摇不安，常陷逆境：凶";
				gn[69] = "惨淡经营，难免贫困：凶";
				gn[70] = "吉凶参半，惟赖勇气：吉带凶";
				gn[71] = "得而复失，难以安顺：凶";
				gn[72] = "安乐自来，自然吉祥：吉";
				gn[73] = "如无智谋，难望成功：凶";
				gn[74] = "吉中带凶，进不如守：吉带凶";
				gn[75] = "此数大凶，破产之象：凶";
				gn[76] = "先苦後甘，不致失败：吉带凶";
				gn[77] = "有得有失，华而不实：吉带凶";
				gn[78] = "前途无光，希望不大：凶";
				gn[79] = "得而复失，枉费心机：吉带凶";
				gn[80] = "最极之数，能得成功：吉";

				String m_str_oldresult = m_tv_result.getText().toString();
				m_tv_result.setText(m_str_oldresult + "\n尾号" + m_str_inputnum
						+ "，余数:" + r1 + " -> " + gn[r1]);
			}
		});
	}
}