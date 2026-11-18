package org.lineageos.internal.util;

import android.content.Context;
import android.provider.Settings;

public class LineageLockPatternUtils {
    private static final String KEY_PASS_TO_SECURITY = "lineage_pass_to_security_view";

    private final Context mContext;

    public LineageLockPatternUtils(Context context) {
        mContext = context;
    }

    public boolean shouldPassToSecurityView(int userId) {
        return Settings.Secure.getIntForUser(
                mContext.getContentResolver(), KEY_PASS_TO_SECURITY, 0, userId) != 0;
    }

    public void setPassToSecurityView(boolean enabled, int userId) {
        Settings.Secure.putIntForUser(
                mContext.getContentResolver(), KEY_PASS_TO_SECURITY, enabled ? 1 : 0, userId);
    }
}
