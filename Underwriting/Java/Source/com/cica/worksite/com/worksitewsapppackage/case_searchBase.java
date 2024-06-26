/*
  This class has been generated by the Code Generator
*/

package com.worksitewsapppackage;

import com.cordys.cpc.bsf.busobject.BusObjectConfig;
import com.cordys.cpc.bsf.busobject.BusObjectIterator;
import com.cordys.cpc.bsf.busobject.QueryObject;
import com.cordys.cpc.bsf.classinfo.AttributeInfo;
import com.cordys.cpc.bsf.classinfo.ClassInfo;
import com.cordys.cpc.bsf.listeners.constraint.NumberValidator;
import com.cordys.cpc.bsf.listeners.constraint.StringValidator;


public abstract class case_searchBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_GroupNumber = "GroupNumber";
    public final static String ATTR_GROUPNAME = "GROUPNAME";
    public final static String ATTR_EnrollmentEnddate = "EnrollmentEnddate";
    public final static String ATTR_CaseType = "CaseType";
    public final static String ATTR_caseid = "caseid";
    public final static String ATTR_CaseSts = "CaseSts";
    public final static String ATTR_SubmittedPostReview = "SubmittedPostReview";
    public final static String ATTR_taskid = "taskid";
    public final static String ATTR_TaskFile = "TaskFile";
    public final static String ATTR_SubmissionType = "SubmissionType";
    public final static String ATTR_AppCount = "AppCount";
    public final static String ATTR_LSPBatch = "LSPBatch";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(case_search.class);
            s_classInfo.setTableName("case_search");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_GroupNumber);
                ai.setJavaName(ATTR_GroupNumber);
                ai.setColumnName(ATTR_GroupNumber);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_GroupNumber);
                v.setMaxLength(50);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_GROUPNAME);
                ai.setJavaName(ATTR_GROUPNAME);
                ai.setColumnName(ATTR_GROUPNAME);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_GROUPNAME);
                v.setMaxLength(255);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_EnrollmentEnddate);
                ai.setJavaName(ATTR_EnrollmentEnddate);
                ai.setColumnName(ATTR_EnrollmentEnddate);
                ai.setAttributeClass(java.sql.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseType);
                ai.setJavaName(ATTR_CaseType);
                ai.setColumnName(ATTR_CaseType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseType);
                v.setMaxLength(7);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_caseid);
                ai.setJavaName(ATTR_caseid);
                ai.setColumnName(ATTR_caseid);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_caseid);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CaseSts);
                ai.setJavaName(ATTR_CaseSts);
                ai.setColumnName(ATTR_CaseSts);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CaseSts);
                v.setMaxLength(89);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SubmittedPostReview);
                ai.setJavaName(ATTR_SubmittedPostReview);
                ai.setColumnName(ATTR_SubmittedPostReview);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SubmittedPostReview);
                v.setMaxLength(9);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_taskid);
                ai.setJavaName(ATTR_taskid);
                ai.setColumnName(ATTR_taskid);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_taskid);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_TaskFile);
                ai.setJavaName(ATTR_TaskFile);
                ai.setColumnName(ATTR_TaskFile);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_TaskFile);
                v.setMaxLength(200);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_SubmissionType);
                ai.setJavaName(ATTR_SubmissionType);
                ai.setColumnName(ATTR_SubmissionType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_SubmissionType);
                v.setMaxLength(6);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_AppCount);
                ai.setJavaName(ATTR_AppCount);
                ai.setColumnName(ATTR_AppCount);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_AppCount);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_LSPBatch);
                ai.setJavaName(ATTR_LSPBatch);
                ai.setColumnName(ATTR_LSPBatch);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_LSPBatch);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public case_searchBase(BusObjectConfig config)
    {
        super(config);
    }

    public String getGroupNumber()
    {
        return getStringProperty(ATTR_GroupNumber);
    }

    public void setGroupNumber(String value)
    {
        setProperty(ATTR_GroupNumber, value, 0);
    }

    public String getGROUPNAME()
    {
        return getStringProperty(ATTR_GROUPNAME);
    }

    public void setGROUPNAME(String value)
    {
        setProperty(ATTR_GROUPNAME, value, 0);
    }

    public java.sql.Date getEnrollmentEnddate()
    {
        return getSqlDateProperty(ATTR_EnrollmentEnddate);
    }

    public void setEnrollmentEnddate(java.sql.Date value)
    {
        setProperty(ATTR_EnrollmentEnddate, value, 0);
    }

    public String getCaseType()
    {
        return getStringProperty(ATTR_CaseType);
    }

    public void setCaseType(String value)
    {
        setProperty(ATTR_CaseType, value, 0);
    }

    public int getCaseid()
    {
        return getIntProperty(ATTR_caseid);
    }

    public void setCaseid(int value)
    {
        setProperty(ATTR_caseid, value, 0);
    }

    public String getCaseSts()
    {
        return getStringProperty(ATTR_CaseSts);
    }

    public void setCaseSts(String value)
    {
        setProperty(ATTR_CaseSts, value, 0);
    }

    public String getSubmittedPostReview()
    {
        return getStringProperty(ATTR_SubmittedPostReview);
    }

    public void setSubmittedPostReview(String value)
    {
        setProperty(ATTR_SubmittedPostReview, value, 0);
    }

    public int getTaskid()
    {
        return getIntProperty(ATTR_taskid);
    }

    public void setTaskid(int value)
    {
        setProperty(ATTR_taskid, value, 0);
    }

    public String getTaskFile()
    {
        return getStringProperty(ATTR_TaskFile);
    }

    public void setTaskFile(String value)
    {
        setProperty(ATTR_TaskFile, value, 0);
    }

    public String getSubmissionType()
    {
        return getStringProperty(ATTR_SubmissionType);
    }

    public void setSubmissionType(String value)
    {
        setProperty(ATTR_SubmissionType, value, 0);
    }

    public int getAppCount()
    {
        return getIntProperty(ATTR_AppCount);
    }

    public void setAppCount(int value)
    {
        setProperty(ATTR_AppCount, value, 0);
    }

    public String getLSPBatch()
    {
        return getStringProperty(ATTR_LSPBatch);
    }

    public void setLSPBatch(String value)
    {
        setProperty(ATTR_LSPBatch, value, 0);
    }




    public static BusObjectIterator<com.worksitewsapppackage.case_search> getCase_searchObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"case_search\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(case_search.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.worksitewsapppackage.case_search> getCase_searchObjects()
    {
        String queryText = "select * from \"case_search\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(case_search.class);
        return query.getObjects();
    }

}
