package org.pan;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Canvas;

public class Monitor extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Monitor(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		
		TabFolder tabFolder = new TabFolder(composite, SWT.NONE);
		tabFolder.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		TabFolder tabFolder_1 = new TabFolder(composite, SWT.NONE);
		tabFolder_1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite composite_7 = new Composite(composite, SWT.NONE);
		composite_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_7.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Composite composite_8 = new Composite(composite, SWT.NONE);
		composite_8.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		composite_8.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Composite composite_5 = new Composite(composite, SWT.NONE);
		composite_5.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite_5.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Canvas canvas = new Canvas(composite_5, SWT.NONE);
		canvas.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		Composite composite_6 = new Composite(composite, SWT.NONE);
		composite_6.setLayout(new FillLayout(SWT.HORIZONTAL));
		composite_6.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Canvas canvas_1 = new Canvas(composite_6, SWT.NONE);
		canvas_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		Composite composite_1 = new Composite(this, SWT.NONE);
		GridLayout gl_composite_1 = new GridLayout(2, false);
		gl_composite_1.horizontalSpacing = 10;
		composite_1.setLayout(gl_composite_1);
		
		Label lblNewLabel = new Label(composite_1, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 12, SWT.BOLD));
		lblNewLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblNewLabel.setText("停车管理系统");
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
		lblNewLabel_1.setToolTipText("剩余时租车位");
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_1.setText("时租车位");
		
		Label lblNewLabel_2 = new Label(composite_1, SWT.NONE);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_2.setText("1000");
		
		Label lblNewLabel_3 = new Label(composite_1, SWT.NONE);
		lblNewLabel_3.setToolTipText("剩余固定车位");
		lblNewLabel_3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_3.setText("固定车位");
		
		Label lblNewLabel_4 = new Label(composite_1, SWT.NONE);
		lblNewLabel_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_4.setText("100");
		
		Label label_2 = new Label(composite_1, SWT.NONE);
		label_2.setToolTipText("当班收费员工");
		label_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_2.setText("收费员工");
		
		Label label_3 = new Label(composite_1, SWT.NONE);
		label_3.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_3.setText("韩金花");
		
		Label lblNewLabel_5 = new Label(composite_1, SWT.NONE);
		lblNewLabel_5.setToolTipText("当班现金收费");
		lblNewLabel_5.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_5.setText("现金收费");
		
		Label lblNewLabel_6 = new Label(composite_1, SWT.NONE);
		lblNewLabel_6.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_6.setText("8763.5");
		
		Label label_4 = new Label(composite_1, SWT.NONE);
		label_4.setToolTipText("当班优惠金额");
		label_4.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_4.setText("优惠金额");
		
		Label label_5 = new Label(composite_1, SWT.NONE);
		label_5.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_5.setText("43.5");
		
		Label label = new Label(composite_1, SWT.NONE);
		label.setToolTipText("系统当前时间");
		label.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label.setText("当前时间");
		
		Label label_1 = new Label(composite_1, SWT.NONE);
		label_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_1.setText("19/02/21 13:21:22");
		
		Label label_6 = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Composite composite_2 = new Composite(this, SWT.NONE);
		GridLayout gl_composite_2 = new GridLayout(2, false);
		gl_composite_2.horizontalSpacing = 10;
		composite_2.setLayout(gl_composite_2);
		composite_2.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		
		Label lblNewLabel_7 = new Label(composite_2, SWT.NONE);
		lblNewLabel_7.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLUE));
		GridData gd_lblNewLabel_7 = new GridData(SWT.CENTER, SWT.CENTER, false, false, 2, 1);
		gd_lblNewLabel_7.heightHint = 50;
		gd_lblNewLabel_7.widthHint = 120;
		lblNewLabel_7.setLayoutData(gd_lblNewLabel_7);
		
		Label label_7 = new Label(composite_2, SWT.NONE);
		label_7.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_7.setText("车牌号码");
		
		Label lblNewLabel_8 = new Label(composite_2, SWT.NONE);
		lblNewLabel_8.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_8.setText("湘A87678");
		
		Label label_16 = new Label(composite_2, SWT.NONE);
		label_16.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_16.setText("车牌类型");
		
		Label label_17 = new Label(composite_2, SWT.NONE);
		label_17.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_17.setText("临时车");
		
		Label label_8 = new Label(composite_2, SWT.NONE);
		label_8.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_8.setText("进场时间");
		
		Label lblNewLabel_9 = new Label(composite_2, SWT.NONE);
		lblNewLabel_9.setText("19/02/21 12:20:10");
		lblNewLabel_9.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		
		Label label_9 = new Label(composite_2, SWT.NONE);
		label_9.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_9.setText("出场时间");
		
		Label lblNewLabel_10 = new Label(composite_2, SWT.NONE);
		lblNewLabel_10.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_10.setText("19/02/21 13:20:10");
		
		Label label_10 = new Label(composite_2, SWT.NONE);
		label_10.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_10.setText("停车时间");
		
		Label lblNewLabel_11 = new Label(composite_2, SWT.NONE);
		lblNewLabel_11.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_11.setText("01:00:00");
		
		Label label_15 = new Label(composite_2, SWT.NONE);
		label_15.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		label_15.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_15.setText("车辆类型");
		
		ComboViewer comboViewer = new ComboViewer(composite_2, SWT.NONE);
		Combo combo = comboViewer.getCombo();
		combo.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		GridData gd_combo = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_combo.widthHint = 50;
		combo.setLayoutData(gd_combo);
		
		Label label_11 = new Label(composite_2, SWT.NONE);
		label_11.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_11.setText("应收金额");
		
		Label lblNewLabel_12 = new Label(composite_2, SWT.NONE);
		lblNewLabel_12.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_12.setText("10.0");
		
		Label label_12 = new Label(composite_2, SWT.NONE);
		label_12.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_12.setText("优惠金额");
		
		Label lblNewLabel_13 = new Label(composite_2, SWT.NONE);
		lblNewLabel_13.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_13.setText("2.0");
		
		Label label_14 = new Label(composite_2, SWT.NONE);
		label_14.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_14.setText("己收金额");
		
		Label lblNewLabel_14 = new Label(composite_2, SWT.NONE);
		lblNewLabel_14.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_14.setText("0.0");
		
		Label label_13 = new Label(composite_2, SWT.NONE);
		label_13.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		label_13.setText("实收金额");
		
		Label lblNewLabel_15 = new Label(composite_2, SWT.NONE);
		lblNewLabel_15.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNewLabel_15.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		lblNewLabel_15.setText("8.0");
		
		Button btnNewButton = new Button(composite_2, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		btnNewButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		btnNewButton.setText("收费放行");
		
		Button btnNewButton_1 = new Button(composite_2, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		btnNewButton_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		btnNewButton_1.setText("免费放行");
		
		Button btnNewButton_2 = new Button(composite_2, SWT.NONE);
		btnNewButton_2.setFont(SWTResourceManager.getFont("Microsoft YaHei UI", 13, SWT.NORMAL));
		btnNewButton_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1));
		btnNewButton_2.setText("扫码收费");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}
