package net.deali.designsystem.sample.data.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.Locale

class DataStoreUtil(
    private val context: Context
) {
    fun getLanguage(): Flow<String> = context.dataStore.data
        .map { preferences ->
            preferences[KEY_LOCALE_LANGUAGE] ?: Locale.KOREA.language
        }

    suspend fun putLanguage(language: String) {
        context.dataStore.edit { preferences ->
            preferences[KEY_LOCALE_LANGUAGE] = language
        }
    }

    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore("settings")

        val KEY_LOCALE_LANGUAGE = stringPreferencesKey("language")
    }
}
