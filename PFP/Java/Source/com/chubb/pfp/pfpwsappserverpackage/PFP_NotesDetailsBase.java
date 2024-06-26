/*
  This class has been generated by the Code Generator
*/

package com.chubb.pfp.pfpwsappserverpackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class PFP_NotesDetailsBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_SNO = "SNO";
    public final static String ATTR_PolicyNumber = "PolicyNumber";
    public final static String ATTR_CaseID = "CaseID";
    public final static String ATTR_CaseTitle = "CaseTitle";
    public final static String ATTR_CreationDate = "CreationDate";
    public final static String ATTR_LoggedBy = "LoggedBy";
    public final static String ATTR_Notes = "Notes";
    public final static String ATTR_TaskInstanceID = "TaskInstanceID";
    public final static String ATTR_action_type = "action_type";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(PFP_NotesDetails.class);
            s_classInfo.setTableName("PFP_NotesDetails");
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
                AttributeInfo ai = new AttributeInfo(ATTR_CaseTitle);
                ai.setJavaName(ATTR_CaseTitle);
                ai.setColumnName(ATTR_CaseTitle);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseTitle);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CreationDate);
                ai.setJavaName(ATTR_CreationDate);
                ai.setColumnName(ATTR_CreationDate);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_LoggedBy);
                ai.setJavaName(ATTR_LoggedBy);
                ai.setColumnName(ATTR_LoggedBy);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_LoggedBy);
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
                AttributeInfo ai = new AttributeInfo(ATTR_action_type);
                ai.setJavaName(ATTR_action_type);
                ai.setColumnName(ATTR_action_type);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_action_type);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public PFP_NotesDetailsBase(BusObjectConfig config)
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

    public String getPolicyNumber()
    {
        return getStringProperty(ATTR_PolicyNumber);
    }

    public void setPolicyNumber(String value)
    {
        setProperty(ATTR_PolicyNumber, value, 0);
    }

    public String getCaseID()
    {
        return getStringProperty(ATTR_CaseID);
    }

    public void setCaseID(String value)
    {
        setProperty(ATTR_CaseID, value, 0);
    }

    public String getCaseTitle()
    {
        return getStringProperty(ATTR_CaseTitle);
    }

    public void setCaseTitle(String value)
    {
        setProperty(ATTR_CaseTitle, value, 0);
    }

    public java.util.Date getCreationDate()
    {
        return getDateTimestampProperty(ATTR_CreationDate);
    }

    public void setCreationDate(java.util.Date value)
    {
        setProperty(ATTR_CreationDate, value, 0);
    }

    public String getLoggedBy()
    {
        return getStringProperty(ATTR_LoggedBy);
    }

    public void setLoggedBy(String value)
    {
        setProperty(ATTR_LoggedBy, value, 0);
    }

    public String getNotes()
    {
        return getStringProperty(ATTR_Notes);
    }

    public void setNotes(String value)
    {
        setProperty(ATTR_Notes, value, 0);
    }

    public String getTaskInstanceID()
    {
        return getStringProperty(ATTR_TaskInstanceID);
    }

    public void setTaskInstanceID(String value)
    {
        setProperty(ATTR_TaskInstanceID, value, 0);
    }

    public String getAction_type()
    {
        return getStringProperty(ATTR_action_type);
    }

    public void setAction_type(String value)
    {
        setProperty(ATTR_action_type, value, 0);
    }


    public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_NotesDetails> getNextPFP_NotesDetailsObjects(int SNO, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"PFP_NotesDetails\" where (\"SNO\" > :SNO) order by \"SNO\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SNO", "PFP_NotesDetails.SNO", QueryObject.PARAM_INT, new Integer(SNO));//NOPMD
        query.setResultClass(PFP_NotesDetails.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.chubb.pfp.pfpwsappserverpackage.PFP_NotesDetails getPFP_NotesDetailsObject(int SNO)
    {
        String queryText = "select * from \"PFP_NotesDetails\" where \"SNO\" = :SNO";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SNO", "PFP_NotesDetails.SNO", QueryObject.PARAM_INT, new Integer(SNO));//NOPMD
        query.setResultClass(PFP_NotesDetails.class);
        return (PFP_NotesDetails)query.getObject();
    }

    public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_NotesDetails> getPFP_NotesDetailsObjects(int fromSNO, int toSNO, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"PFP_NotesDetails\" where \"SNO\" between :fromSNO and :toSNO";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromSNO", "PFP_NotesDetails.SNO", QueryObject.PARAM_INT, new Integer(fromSNO));
        query.addParameter("toSNO", "PFP_NotesDetails.SNO", QueryObject.PARAM_INT, new Integer(toSNO));
        query.setResultClass(PFP_NotesDetails.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_NotesDetails> getPFP_NotesDetailsObjects(int fromSNO, int toSNO)
    {
        String queryText = "select * from \"PFP_NotesDetails\" where \"SNO\" between :fromSNO and :toSNO";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromSNO", "PFP_NotesDetails.SNO", QueryObject.PARAM_INT, new Integer(fromSNO));
        query.addParameter("toSNO", "PFP_NotesDetails.SNO", QueryObject.PARAM_INT, new Integer(toSNO));
        query.setResultClass(PFP_NotesDetails.class);
        return query.getObjects();
    }

    public static BusObjectIterator<com.chubb.pfp.pfpwsappserverpackage.PFP_NotesDetails> getPreviousPFP_NotesDetailsObjects(int SNO, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"PFP_NotesDetails\" where (\"SNO\" < :SNO) order by \"SNO\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("SNO", "PFP_NotesDetails.SNO", QueryObject.PARAM_INT, new Integer(SNO));//NOPMD
        query.setResultClass(PFP_NotesDetails.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

}