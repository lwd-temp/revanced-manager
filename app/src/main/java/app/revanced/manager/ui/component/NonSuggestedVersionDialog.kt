package app.revanced.manager.ui.component

import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import app.revanced.manager.R

@Composable
fun NonSuggestedVersionDialog(onCancel: () -> Unit, onContinue: (Boolean) -> Unit, suggestedVersion: String) {
    DangerousActionDialogBase(
        onCancel = onCancel,
        confirmButton = { dismissPermanently ->
            TextButton(
                onClick = { onContinue(dismissPermanently) }
            ) {
                Text(stringResource(R.string.continue_))
            }
        },
        title = R.string.version_warning_title,
        body = stringResource(R.string.version_warning_description, suggestedVersion),
    )
}