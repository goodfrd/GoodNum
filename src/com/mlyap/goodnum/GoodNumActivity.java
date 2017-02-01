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
				gn[1] = "��չ��ͼ���ɻ�ɹ�����";
				gn[2] = "һʢһ˥���Ͷ��޹�����";
				gn[3] = "�������ϣ�����˳�죺��";
				gn[4] = "����ǰ;��������ĥ����";
				gn[5] = "�������٣�����˫�գ���";
				gn[6] = "�콵���ˣ��ɳɴ󹦣���";
				gn[7] = "�������飬�ػ�ɹ�����";
				gn[8] = "�᳹־�����ɹ����ڣ���";
				gn[9] = "��Ӫ������������������";
				gn[10] = "�շ�������ͽ���޹�����";
				gn[11] = "�Ƚ���ʵ���ص���������";
				gn[12] = "����������ı���ѳɣ���";
				gn[13] = "�츳���ˣ��ܵ���������";
				gn[14] = "�ǳ��ǰܣ�Ω�����㣺��";
				gn[15] = "���³ɾͣ�һ����¡����";
				gn[16] = "�ɾʹ�ҵ������˫�գ���";
				gn[17] = "�й��������ɵóɹ�����";
				gn[18] = "˳����¡�����º�ͨ����";
				gn[19] = "���ⲻ�ϣ��ϰ����أ���";
				gn[20] = "�������ѣ��������ͣ���";
				gn[21] = "ר�ľ�Ӫ�������ǻۣ���";
				gn[22] = "���Ų������²����⣺��";
				gn[23] = "�����ķ����ճɴ�ҵ����";
				gn[24] = "�뿿����������󹦣���";
				gn[25] = "��ʱ�������ٵ��˸񣺼�";
				gn[26] = "���������������ѣ���";
				gn[27] = "һʢһ˥�����سɹ����״���";
				gn[28] = "����ֱ�ϣ������๦����";
				gn[29] = "���ײΰ룬��ʧ��飺��";
				gn[30] = "����˫�գ���ҵ�ɾͣ���";
				gn[31] = "����֮�����ɹ���������";
				gn[32] = "�ǻ���ʼ���ؿɲ�¡����";
				gn[33] = "���Ѳ����������ɹ�����";
				gn[34] = "�м�֮�������˱��أ���";
				gn[35] = "�����ص���������������";
				gn[36] = "���׻����������˳����";
				gn[37] = "����ɵã������ѻ��״���";
				gn[38] = "����̹;��ָ�տɴ�����";
				gn[39] = "һʢһ˥������������������";
				gn[40] = "�츳���ˣ�ǰ;���ޣ���";
				gn[41] = "��ҵ��ר��ʮ�Ų��ɣ�������";
				gn[42] = "�������أ�ת��Ϊ����������";
				gn[43] = "������Ը��̰���ý�����";
				gn[44] = "��Ҷ��֦��һ�ٳ�������";
				gn[45] = "������ƽ���������أ���";
				gn[46] = "�й��������ɳɴ�ҵ����";
				gn[47] = "������ȫ�����ٸ��󣺼�";
				gn[48] = "�����򼪣��������ף���";
				gn[49] = "���׻�����һ��һ�ܣ�������";
				gn[50] = "һʢһ˥������������������";
				gn[51] = "������࣬����ɹ�����";
				gn[52] = "ʢ˥�ΰ룬�ȼ����ף�������";
				gn[53] = "����ȫ���������ɹ�����";
				gn[54] = "���¡��������������������";
				gn[55] = "����ԸΥ�����ѳɹ�����";
				gn[56] = "Ŭ����Ӫ��ʱ����ת����";
				gn[57] = "������ˣ�ʼ���ռ����״���";
				gn[58] = "�������ɣ��������£���";
				gn[59] = "�������ң��Ѷ����룺��";
				gn[60] = "���ڰ��£������粨��������";
				gn[61] = "���ư��գ�������չ����";
				gn[62] = "���ﻯ��������֮�󣺼�";
				gn[63] = "ʮ�Ų��ɣ�ͽ���޹�����";
				gn[64] = "��������������ʢ������";
				gn[65] = "���ⲻ�ͣ�����ȱ������";
				gn[66] = "�������⣬������������";
				gn[67] = "��ʧ�Ȼ��������ɹ�����";
				gn[68] = "��ҡ�����������澳����";
				gn[69] = "�ҵ���Ӫ������ƶ������";
				gn[70] = "���ײΰ룬Ω��������������";
				gn[71] = "�ö���ʧ�����԰�˳����";
				gn[72] = "������������Ȼ���飺��";
				gn[73] = "������ı�������ɹ�����";
				gn[74] = "���д��ף��������أ�������";
				gn[75] = "�������ף��Ʋ�֮����";
				gn[76] = "�ȿ���ʣ�����ʧ�ܣ�������";
				gn[77] = "�е���ʧ��������ʵ��������";
				gn[78] = "ǰ;�޹⣬ϣ��������";
				gn[79] = "�ö���ʧ�������Ļ���������";
				gn[80] = "�֮�����ܵóɹ�����";

				String m_str_oldresult = m_tv_result.getText().toString();
				m_tv_result.setText(m_str_oldresult + "\nβ��" + m_str_inputnum
						+ "������:" + r1 + " -> " + gn[r1]);
			}
		});
	}
}