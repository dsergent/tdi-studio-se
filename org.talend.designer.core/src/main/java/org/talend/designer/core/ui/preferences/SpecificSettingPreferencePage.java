// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.designer.core.ui.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.talend.core.model.repository.IRepositoryPrefConstants;
import org.talend.core.model.repository.RepositoryManager;
import org.talend.core.prefs.ITalendCorePrefConstants;

public class SpecificSettingPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    public SpecificSettingPreferencePage() {
        setPreferenceStore(RepositoryManager.getPreferenceStore());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
     */
    @Override
    protected void createFieldEditors() {
        addField(new BooleanFieldEditor(IRepositoryPrefConstants.ALLOW_SPECIFIC_CHARACTERS_FOR_SCHEMA_COLUMNS,
                "Allow specific characters (UTF8,...) for columns of schemas", getFieldEditorParent()));

        addField(new BooleanFieldEditor(ITalendCorePrefConstants.FORBIDDEN_MAPPING_LENGTH_PREC_LOGIC,
                "Forbidden mappingfile length and precision logic", getFieldEditorParent()));

    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {

    }

}
