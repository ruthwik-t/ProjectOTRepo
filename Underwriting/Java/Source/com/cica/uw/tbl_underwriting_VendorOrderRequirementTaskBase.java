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


public abstract class tbl_underwriting_VendorOrderRequirementTaskBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_tableid = "tableid";
    public final static String ATTR_case_id = "case_id";
    public final static String ATTR_PersonalDetails = "PersonalDetails";
    public final static String ATTR_RequirementType = "RequirementType";
    public final static String ATTR_ApplicantDetails = "ApplicantDetails";
    public final static String ATTR_PhiDetails = "PhiDetails";
    public final static String ATTR_ApsDetails = "ApsDetails";
    public final static String ATTR_MvrDetails = "MvrDetails";
    public final static String ATTR_ToolKits = "ToolKits";
    public final static String ATTR_CheckLists = "CheckLists";
    public final static String ATTR_CompletedRequirementFlag = "CompletedRequirementFlag";
    public final static String ATTR_req_id = "req_id";
    public final static String ATTR_FollowupReason = "FollowupReason";
    public final static String ATTR_FollowUpCounter = "FollowUpCounter";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_underwriting_VendorOrderRequirementTask.class);
            s_classInfo.setTableName("tbl_underwriting_VendorOrderRequirementTask");
            s_classInfo.setUIDElements(new String[]{ATTR_tableid});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_tableid);
                ai.setJavaName(ATTR_tableid);
                ai.setColumnName(ATTR_tableid);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_tableid);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_case_id);
                ai.setJavaName(ATTR_case_id);
                ai.setColumnName(ATTR_case_id);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_case_id);
                v.setMaxLength(250);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PersonalDetails);
                ai.setJavaName(ATTR_PersonalDetails);
                ai.setColumnName(ATTR_PersonalDetails);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PersonalDetails);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_RequirementType);
                ai.setJavaName(ATTR_RequirementType);
                ai.setColumnName(ATTR_RequirementType);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_RequirementType);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ApplicantDetails);
                ai.setJavaName(ATTR_ApplicantDetails);
                ai.setColumnName(ATTR_ApplicantDetails);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ApplicantDetails);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_PhiDetails);
                ai.setJavaName(ATTR_PhiDetails);
                ai.setColumnName(ATTR_PhiDetails);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_PhiDetails);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ApsDetails);
                ai.setJavaName(ATTR_ApsDetails);
                ai.setColumnName(ATTR_ApsDetails);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ApsDetails);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_MvrDetails);
                ai.setJavaName(ATTR_MvrDetails);
                ai.setColumnName(ATTR_MvrDetails);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_MvrDetails);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ToolKits);
                ai.setJavaName(ATTR_ToolKits);
                ai.setColumnName(ATTR_ToolKits);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ToolKits);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CheckLists);
                ai.setJavaName(ATTR_CheckLists);
                ai.setColumnName(ATTR_CheckLists);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CheckLists);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CompletedRequirementFlag);
                ai.setJavaName(ATTR_CompletedRequirementFlag);
                ai.setColumnName(ATTR_CompletedRequirementFlag);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CompletedRequirementFlag);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_req_id);
                ai.setJavaName(ATTR_req_id);
                ai.setColumnName(ATTR_req_id);
                ai.setAttributeClass(long.class);
                NumberValidator v = new NumberValidator(ATTR_req_id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_FollowupReason);
                ai.setJavaName(ATTR_FollowupReason);
                ai.setColumnName(ATTR_FollowupReason);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_FollowupReason);
                v.setMaxLength(2147483647);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_FollowUpCounter);
                ai.setJavaName(ATTR_FollowUpCounter);
                ai.setColumnName(ATTR_FollowUpCounter);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_FollowUpCounter);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public tbl_underwriting_VendorOrderRequirementTaskBase(BusObjectConfig config)
    {
        super(config);
    }

    public long getTableid()
    {
        return getLongProperty(ATTR_tableid);
    }

    public void setTableid(long value)
    {
        setProperty(ATTR_tableid, value, 0);
    }

    public String getCase_id()
    {
        return getStringProperty(ATTR_case_id);
    }

    public void setCase_id(String value)
    {
        setProperty(ATTR_case_id, value, 0);
    }

    public String getPersonalDetails()
    {
        return getStringProperty(ATTR_PersonalDetails);
    }

    public void setPersonalDetails(String value)
    {
        setProperty(ATTR_PersonalDetails, value, 0);
    }

    public String getRequirementType()
    {
        return getStringProperty(ATTR_RequirementType);
    }

    public void setRequirementType(String value)
    {
        setProperty(ATTR_RequirementType, value, 0);
    }

    public String getApplicantDetails()
    {
        return getStringProperty(ATTR_ApplicantDetails);
    }

    public void setApplicantDetails(String value)
    {
        setProperty(ATTR_ApplicantDetails, value, 0);
    }

    public String getPhiDetails()
    {
        return getStringProperty(ATTR_PhiDetails);
    }

    public void setPhiDetails(String value)
    {
        setProperty(ATTR_PhiDetails, value, 0);
    }

    public String getApsDetails()
    {
        return getStringProperty(ATTR_ApsDetails);
    }

    public void setApsDetails(String value)
    {
        setProperty(ATTR_ApsDetails, value, 0);
    }

    public String getMvrDetails()
    {
        return getStringProperty(ATTR_MvrDetails);
    }

    public void setMvrDetails(String value)
    {
        setProperty(ATTR_MvrDetails, value, 0);
    }

    public String getToolKits()
    {
        return getStringProperty(ATTR_ToolKits);
    }

    public void setToolKits(String value)
    {
        setProperty(ATTR_ToolKits, value, 0);
    }

    public String getCheckLists()
    {
        return getStringProperty(ATTR_CheckLists);
    }

    public void setCheckLists(String value)
    {
        setProperty(ATTR_CheckLists, value, 0);
    }

    public String getCompletedRequirementFlag()
    {
        return getStringProperty(ATTR_CompletedRequirementFlag);
    }

    public void setCompletedRequirementFlag(String value)
    {
        setProperty(ATTR_CompletedRequirementFlag, value, 0);
    }

    public long getReq_id()
    {
        return getLongProperty(ATTR_req_id);
    }

    public void setReq_id(long value)
    {
        setProperty(ATTR_req_id, value, 0);
    }

    public String getFollowupReason()
    {
        return getStringProperty(ATTR_FollowupReason);
    }

    public void setFollowupReason(String value)
    {
        setProperty(ATTR_FollowupReason, value, 0);
    }

    public int getFollowUpCounter()
    {
        return getIntProperty(ATTR_FollowUpCounter);
    }

    public void setFollowUpCounter(int value)
    {
        setProperty(ATTR_FollowUpCounter, value, 0);
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_VendorOrderRequirementTask> getNextTbl_underwriting_VendorOrderRequirementTaskObjects(long Tableid, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_VendorOrderRequirementTask\" where (\"tableid\" > :Tableid) order by \"tableid\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Tableid", "tbl_underwriting_VendorOrderRequirementTask.tableid", QueryObject.PARAM_INT, new Long(Tableid));//NOPMD
        query.setResultClass(tbl_underwriting_VendorOrderRequirementTask.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_VendorOrderRequirementTask> getPreviousTbl_underwriting_VendorOrderRequirementTaskObjects(long Tableid, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_VendorOrderRequirementTask\" where (\"tableid\" < :Tableid) order by \"tableid\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Tableid", "tbl_underwriting_VendorOrderRequirementTask.tableid", QueryObject.PARAM_INT, new Long(Tableid));//NOPMD
        query.setResultClass(tbl_underwriting_VendorOrderRequirementTask.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.cica.uw.tbl_underwriting_VendorOrderRequirementTask getTbl_underwriting_VendorOrderRequirementTaskObject(long Tableid)
    {
        String queryText = "select * from \"tbl_underwriting_VendorOrderRequirementTask\" where \"tableid\" = :Tableid";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Tableid", "tbl_underwriting_VendorOrderRequirementTask.tableid", QueryObject.PARAM_INT, new Long(Tableid));//NOPMD
        query.setResultClass(tbl_underwriting_VendorOrderRequirementTask.class);
        return (tbl_underwriting_VendorOrderRequirementTask)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_VendorOrderRequirementTask> getTbl_underwriting_VendorOrderRequirementTaskObjects(long fromTableid, long toTableid, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_underwriting_VendorOrderRequirementTask\" where \"tableid\" between :fromTableid and :toTableid";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromTableid", "tbl_underwriting_VendorOrderRequirementTask.tableid", QueryObject.PARAM_INT, new Long(fromTableid));
        query.addParameter("toTableid", "tbl_underwriting_VendorOrderRequirementTask.tableid", QueryObject.PARAM_INT, new Long(toTableid));
        query.setResultClass(tbl_underwriting_VendorOrderRequirementTask.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_underwriting_VendorOrderRequirementTask> getTbl_underwriting_VendorOrderRequirementTaskObjects(long fromTableid, long toTableid)
    {
        String queryText = "select * from \"tbl_underwriting_VendorOrderRequirementTask\" where \"tableid\" between :fromTableid and :toTableid";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromTableid", "tbl_underwriting_VendorOrderRequirementTask.tableid", QueryObject.PARAM_INT, new Long(fromTableid));
        query.addParameter("toTableid", "tbl_underwriting_VendorOrderRequirementTask.tableid", QueryObject.PARAM_INT, new Long(toTableid));
        query.setResultClass(tbl_underwriting_VendorOrderRequirementTask.class);
        return query.getObjects();
    }


}
