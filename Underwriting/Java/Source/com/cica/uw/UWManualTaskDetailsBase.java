/*
  This class has been generated by the Code Generator
*/

package com.cica.uw;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class UWManualTaskDetailsBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_SNO = "SNO";
    public final static String ATTR_ServiceType = "ServiceType";
    public final static String ATTR_PolicyNumber = "PolicyNumber";
    public final static String ATTR_InsuredName = "InsuredName";
    public final static String ATTR_CustomerID = "CustomerID";
    public final static String ATTR_LanguagePreference = "LanguagePreference";
    public final static String ATTR_Source = "Source";
    public final static String ATTR_Company = "Company";
    public final static String ATTR_State = "State";
    public final static String ATTR_DueDate = "DueDate";
    public final static String ATTR_Status = "Status";
    public final static String ATTR_CreatedBy = "CreatedBy";
    public final static String ATTR_CreatedOn = "CreatedOn";
    public final static String ATTR_taskData = "taskData";
    public final static String ATTR_CaseID = "CaseID";
    public final static String ATTR_TaskType = "TaskType";
    public final static String ATTR_SourceWorkList = "SourceWorkList";
    public final static String ATTR_DestinationWorkList = "DestinationWorkList";
    public final static String ATTR_Notes = "Notes";
    public final static String ATTR_Linked_SNO = "Linked_SNO";
    public final static String ATTR_SpecialHandlingCode = "SpecialHandlingCode";
    public final static String ATTR_CompletedOn = "CompletedOn";
    public final static String ATTR_Dependent_SNO = "Dependent_SNO";
    public final static String ATTR_ActivityTaskData = "ActivityTaskData";
    public final static String ATTR_CM_Docid = "CM_Docid";
    public final static String ATTR_ScanDate = "ScanDate";
    public final static String ATTR_CRMCaseID = "CRMCaseID";
    public final static String ATTR_SubTaskType = "SubTaskType";
    public final static String ATTR_MDMID = "MDMID";
    public final static String ATTR_CustomerAdminSystem = "CustomerAdminSystem";
    public final static String ATTR_TaskInstanceID = "TaskInstanceID";
    public final static String ATTR_returnTask = "returnTask";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(UWManualTaskDetails.class);
            s_classInfo.setTableName("UWManualTaskDetails");
            s_classInfo.setUIDElements(new String[]{ATTR_SNO});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SNO);
                ai.setJavaName(ATTR_SNO);
                ai.setColumnName(ATTR_SNO);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_SNO);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ServiceType);
                ai.setJavaName(ATTR_ServiceType);
                ai.setColumnName(ATTR_ServiceType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ServiceType);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PolicyNumber);
                ai.setJavaName(ATTR_PolicyNumber);
                ai.setColumnName(ATTR_PolicyNumber);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PolicyNumber);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_InsuredName);
                ai.setJavaName(ATTR_InsuredName);
                ai.setColumnName(ATTR_InsuredName);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_InsuredName);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CustomerID);
                ai.setJavaName(ATTR_CustomerID);
                ai.setColumnName(ATTR_CustomerID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CustomerID);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_LanguagePreference);
                ai.setJavaName(ATTR_LanguagePreference);
                ai.setColumnName(ATTR_LanguagePreference);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_LanguagePreference);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Source);
                ai.setJavaName(ATTR_Source);
                ai.setColumnName(ATTR_Source);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Source);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Company);
                ai.setJavaName(ATTR_Company);
                ai.setColumnName(ATTR_Company);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Company);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_State);
                ai.setJavaName(ATTR_State);
                ai.setColumnName(ATTR_State);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_State);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DueDate);
                ai.setJavaName(ATTR_DueDate);
                ai.setColumnName(ATTR_DueDate);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DueDate);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Status);
                ai.setJavaName(ATTR_Status);
                ai.setColumnName(ATTR_Status);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Status);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CreatedBy);
                ai.setJavaName(ATTR_CreatedBy);
                ai.setColumnName(ATTR_CreatedBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CreatedBy);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CreatedOn);
                ai.setJavaName(ATTR_CreatedOn);
                ai.setColumnName(ATTR_CreatedOn);
                ai.setAttributeClass(java.sql.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_taskData);
                ai.setJavaName(ATTR_taskData);
                ai.setColumnName(ATTR_taskData);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_taskData);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseID);
                ai.setJavaName(ATTR_CaseID);
                ai.setColumnName(ATTR_CaseID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseID);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskType);
                ai.setJavaName(ATTR_TaskType);
                ai.setColumnName(ATTR_TaskType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskType);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SourceWorkList);
                ai.setJavaName(ATTR_SourceWorkList);
                ai.setColumnName(ATTR_SourceWorkList);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SourceWorkList);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_DestinationWorkList);
                ai.setJavaName(ATTR_DestinationWorkList);
                ai.setColumnName(ATTR_DestinationWorkList);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_DestinationWorkList);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Notes);
                ai.setJavaName(ATTR_Notes);
                ai.setColumnName(ATTR_Notes);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Notes);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Linked_SNO);
                ai.setJavaName(ATTR_Linked_SNO);
                ai.setColumnName(ATTR_Linked_SNO);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_Linked_SNO);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SpecialHandlingCode);
                ai.setJavaName(ATTR_SpecialHandlingCode);
                ai.setColumnName(ATTR_SpecialHandlingCode);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SpecialHandlingCode);
                v.setMaxLength(30);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CompletedOn);
                ai.setJavaName(ATTR_CompletedOn);
                ai.setColumnName(ATTR_CompletedOn);
                ai.setAttributeClass(java.sql.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Dependent_SNO);
                ai.setJavaName(ATTR_Dependent_SNO);
                ai.setColumnName(ATTR_Dependent_SNO);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_Dependent_SNO);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ActivityTaskData);
                ai.setJavaName(ATTR_ActivityTaskData);
                ai.setColumnName(ATTR_ActivityTaskData);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ActivityTaskData);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CM_Docid);
                ai.setJavaName(ATTR_CM_Docid);
                ai.setColumnName(ATTR_CM_Docid);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CM_Docid);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ScanDate);
                ai.setJavaName(ATTR_ScanDate);
                ai.setColumnName(ATTR_ScanDate);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ScanDate);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CRMCaseID);
                ai.setJavaName(ATTR_CRMCaseID);
                ai.setColumnName(ATTR_CRMCaseID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CRMCaseID);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SubTaskType);
                ai.setJavaName(ATTR_SubTaskType);
                ai.setColumnName(ATTR_SubTaskType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SubTaskType);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_MDMID);
                ai.setJavaName(ATTR_MDMID);
                ai.setColumnName(ATTR_MDMID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_MDMID);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CustomerAdminSystem);
                ai.setJavaName(ATTR_CustomerAdminSystem);
                ai.setColumnName(ATTR_CustomerAdminSystem);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CustomerAdminSystem);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskInstanceID);
                ai.setJavaName(ATTR_TaskInstanceID);
                ai.setColumnName(ATTR_TaskInstanceID);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskInstanceID);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_returnTask);
                ai.setJavaName(ATTR_returnTask);
                ai.setColumnName(ATTR_returnTask);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_returnTask);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public UWManualTaskDetailsBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getSNO()
    {
        return getIntProperty(ATTR_SNO);
    }

    public void setSNO(int value)
    {
        setProperty(ATTR_SNO, value, 0);
    }

    public String getServiceType()
    {
        return getStringProperty(ATTR_ServiceType);
    }

    public void setServiceType(String value)
    {
        setProperty(ATTR_ServiceType, value, 0);
    }

    public String getPolicyNumber()
    {
        return getStringProperty(ATTR_PolicyNumber);
    }

    public void setPolicyNumber(String value)
    {
        setProperty(ATTR_PolicyNumber, value, 0);
    }

    public String getInsuredName()
    {
        return getStringProperty(ATTR_InsuredName);
    }

    public void setInsuredName(String value)
    {
        setProperty(ATTR_InsuredName, value, 0);
    }

    public String getCustomerID()
    {
        return getStringProperty(ATTR_CustomerID);
    }

    public void setCustomerID(String value)
    {
        setProperty(ATTR_CustomerID, value, 0);
    }

    public String getLanguagePreference()
    {
        return getStringProperty(ATTR_LanguagePreference);
    }

    public void setLanguagePreference(String value)
    {
        setProperty(ATTR_LanguagePreference, value, 0);
    }

    public String getSource()
    {
        return getStringProperty(ATTR_Source);
    }

    public void setSource(String value)
    {
        setProperty(ATTR_Source, value, 0);
    }

    public String getCompany()
    {
        return getStringProperty(ATTR_Company);
    }

    public void setCompany(String value)
    {
        setProperty(ATTR_Company, value, 0);
    }

    public String getState()
    {
        return getStringProperty(ATTR_State);
    }

    public void setState(String value)
    {
        setProperty(ATTR_State, value, 0);
    }

    public String getDueDate()
    {
        return getStringProperty(ATTR_DueDate);
    }

    public void setDueDate(String value)
    {
        setProperty(ATTR_DueDate, value, 0);
    }

    public String getStatus()
    {
        return getStringProperty(ATTR_Status);
    }

    public void setStatus(String value)
    {
        setProperty(ATTR_Status, value, 0);
    }

    public String getCreatedBy()
    {
        return getStringProperty(ATTR_CreatedBy);
    }

    public void setCreatedBy(String value)
    {
        setProperty(ATTR_CreatedBy, value, 0);
    }

    public java.sql.Date getCreatedOn()
    {
        return getSqlDateProperty(ATTR_CreatedOn);
    }

    public void setCreatedOn(java.sql.Date value)
    {
        setProperty(ATTR_CreatedOn, value, 0);
    }

    public String getTaskData()
    {
        return getStringProperty(ATTR_taskData);
    }

    public void setTaskData(String value)
    {
        setProperty(ATTR_taskData, value, 0);
    }

    public String getCaseID()
    {
        return getStringProperty(ATTR_CaseID);
    }

    public void setCaseID(String value)
    {
        setProperty(ATTR_CaseID, value, 0);
    }

    public String getTaskType()
    {
        return getStringProperty(ATTR_TaskType);
    }

    public void setTaskType(String value)
    {
        setProperty(ATTR_TaskType, value, 0);
    }

    public String getSourceWorkList()
    {
        return getStringProperty(ATTR_SourceWorkList);
    }

    public void setSourceWorkList(String value)
    {
        setProperty(ATTR_SourceWorkList, value, 0);
    }

    public String getDestinationWorkList()
    {
        return getStringProperty(ATTR_DestinationWorkList);
    }

    public void setDestinationWorkList(String value)
    {
        setProperty(ATTR_DestinationWorkList, value, 0);
    }

    public String getNotes()
    {
        return getStringProperty(ATTR_Notes);
    }

    public void setNotes(String value)
    {
        setProperty(ATTR_Notes, value, 0);
    }

    public int getLinked_SNO()
    {
        return getIntProperty(ATTR_Linked_SNO);
    }

    public void setLinked_SNO(int value)
    {
        setProperty(ATTR_Linked_SNO, value, 0);
    }

    public String getSpecialHandlingCode()
    {
        return getStringProperty(ATTR_SpecialHandlingCode);
    }

    public void setSpecialHandlingCode(String value)
    {
        setProperty(ATTR_SpecialHandlingCode, value, 0);
    }

    public java.sql.Date getCompletedOn()
    {
        return getSqlDateProperty(ATTR_CompletedOn);
    }

    public void setCompletedOn(java.sql.Date value)
    {
        setProperty(ATTR_CompletedOn, value, 0);
    }

    public int getDependent_SNO()
    {
        return getIntProperty(ATTR_Dependent_SNO);
    }

    public void setDependent_SNO(int value)
    {
        setProperty(ATTR_Dependent_SNO, value, 0);
    }

    public String getActivityTaskData()
    {
        return getStringProperty(ATTR_ActivityTaskData);
    }

    public void setActivityTaskData(String value)
    {
        setProperty(ATTR_ActivityTaskData, value, 0);
    }

    public String getCM_Docid()
    {
        return getStringProperty(ATTR_CM_Docid);
    }

    public void setCM_Docid(String value)
    {
        setProperty(ATTR_CM_Docid, value, 0);
    }

    public String getScanDate()
    {
        return getStringProperty(ATTR_ScanDate);
    }

    public void setScanDate(String value)
    {
        setProperty(ATTR_ScanDate, value, 0);
    }

    public String getCRMCaseID()
    {
        return getStringProperty(ATTR_CRMCaseID);
    }

    public void setCRMCaseID(String value)
    {
        setProperty(ATTR_CRMCaseID, value, 0);
    }

    public String getSubTaskType()
    {
        return getStringProperty(ATTR_SubTaskType);
    }

    public void setSubTaskType(String value)
    {
        setProperty(ATTR_SubTaskType, value, 0);
    }

    public String getMDMID()
    {
        return getStringProperty(ATTR_MDMID);
    }

    public void setMDMID(String value)
    {
        setProperty(ATTR_MDMID, value, 0);
    }

    public String getCustomerAdminSystem()
    {
        return getStringProperty(ATTR_CustomerAdminSystem);
    }

    public void setCustomerAdminSystem(String value)
    {
        setProperty(ATTR_CustomerAdminSystem, value, 0);
    }

    public String getTaskInstanceID()
    {
        return getStringProperty(ATTR_TaskInstanceID);
    }

    public void setTaskInstanceID(String value)
    {
        setProperty(ATTR_TaskInstanceID, value, 0);
    }

    public String getReturnTask()
    {
        return getStringProperty(ATTR_returnTask);
    }

    public void setReturnTask(String value)
    {
        setProperty(ATTR_returnTask, value, 0);
    }



    public static BusObjectIterator<com.cica.uw.UWManualTaskDetails> getNextUWManualTaskDetailsObjects(int SNO, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"UWManualTaskDetails\" where (\"SNO\" > :SNO) order by \"SNO\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SNO", "UWManualTaskDetails.SNO", QueryObject.PARAM_INT, new Integer(SNO));//NOPMD
        query.setResultClass(UWManualTaskDetails.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.UWManualTaskDetails> getPreviousUWManualTaskDetailsObjects(int SNO, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"UWManualTaskDetails\" where (\"SNO\" < :SNO) order by \"SNO\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SNO", "UWManualTaskDetails.SNO", QueryObject.PARAM_INT, new Integer(SNO));//NOPMD
        query.setResultClass(UWManualTaskDetails.class);
        query.setCursor(cursor);
        return query.getObjects();
    }




    public static com.cica.uw.UWManualTaskDetails getUWManualTaskDetailsObject(int SNO)
    {
        String queryText = "select * from \"UWManualTaskDetails\" where \"SNO\" = :SNO";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SNO", "UWManualTaskDetails.SNO", QueryObject.PARAM_INT, new Integer(SNO));//NOPMD
        query.setResultClass(UWManualTaskDetails.class);
        return (UWManualTaskDetails)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.UWManualTaskDetails> getUWManualTaskDetailsObjects(int fromSNO, int toSNO, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"UWManualTaskDetails\" where \"SNO\" between :fromSNO and :toSNO";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromSNO", "UWManualTaskDetails.SNO", QueryObject.PARAM_INT, new Integer(fromSNO));
        query.addParameter("toSNO", "UWManualTaskDetails.SNO", QueryObject.PARAM_INT, new Integer(toSNO));
        query.setResultClass(UWManualTaskDetails.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.UWManualTaskDetails> getUWManualTaskDetailsObjects(int fromSNO, int toSNO)
    {
        String queryText = "select * from \"UWManualTaskDetails\" where \"SNO\" between :fromSNO and :toSNO";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromSNO", "UWManualTaskDetails.SNO", QueryObject.PARAM_INT, new Integer(fromSNO));
        query.addParameter("toSNO", "UWManualTaskDetails.SNO", QueryObject.PARAM_INT, new Integer(toSNO));
        query.setResultClass(UWManualTaskDetails.class);
        return query.getObjects();
    }


}
