package com.itrip.common;

import roboguice.fragment.RoboFragment;
import synjones.common.extension.StringUtil;

import com.itrip.utils.Const;

public class SuperFragment extends RoboFragment {
	public int GetParentID() {
		return getArguments().getInt("ParentID", 1);
	}

	public String GetToken() {
		return getAppInfo(Const.COOKIEKEY);
	}

	public void RedirectToActivity(boolean paramBoolean, String paramString1,
			String paramString2) {
	}

	protected String getAppInfo(String paramString) {
		Object localObject = getAppValue(paramString);
		if (localObject != null)
			return localObject.toString();
		return "";
	}

	protected Object getAppValue(String paramString) {
		return ((MyApplication) getActivity().getApplication())
				.get(paramString);
	}

	protected boolean isLogin(boolean paramBoolean) {
		String str = GetToken();
		return (!paramBoolean) || (!StringUtil.isNullOrEmpty(str));
	}
}
