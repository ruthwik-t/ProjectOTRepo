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


public abstract class tbl_state_provBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_id = "id";
    public final static String ATTR_name = "name";
    public final static String ATTR_full_name = "full_name";
    public final static String ATTR_code = "code";
    public final static String ATTR_is_default = "is_default";
    public final static String ATTR_dev = "dev";
    public final static String ATTR_display_order = "display_order";
    public final static String ATTR_state_numeric_code = "state_numeric_code";
    public final static String ATTR_state_prov2country = "state_prov2country";
    public final static String ATTR_ref_id = "ref_id";
    public final static String ATTR_guid = "guid";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(tbl_state_prov.class);
            s_classInfo.setTableName("tbl_state_prov");
            s_classInfo.setUIDElements(new String[]{});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_id);
                ai.setJavaName(ATTR_id);
                ai.setColumnName(ATTR_id);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_name);
                ai.setJavaName(ATTR_name);
                ai.setColumnName(ATTR_name);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_name);
                v.setMaxLength(40);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_full_name);
                ai.setJavaName(ATTR_full_name);
                ai.setColumnName(ATTR_full_name);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_full_name);
                v.setMaxLength(80);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_code);
                ai.setJavaName(ATTR_code);
                ai.setColumnName(ATTR_code);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_code);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_is_default);
                ai.setJavaName(ATTR_is_default);
                ai.setColumnName(ATTR_is_default);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_is_default);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_dev);
                ai.setJavaName(ATTR_dev);
                ai.setColumnName(ATTR_dev);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_dev);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_display_order);
                ai.setJavaName(ATTR_display_order);
                ai.setColumnName(ATTR_display_order);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_display_order);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_state_numeric_code);
                ai.setJavaName(ATTR_state_numeric_code);
                ai.setColumnName(ATTR_state_numeric_code);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_state_numeric_code);
                v.setMaxLength(2);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_state_prov2country);
                ai.setJavaName(ATTR_state_prov2country);
                ai.setColumnName(ATTR_state_prov2country);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_state_prov2country);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ref_id);
                ai.setJavaName(ATTR_ref_id);
                ai.setColumnName(ATTR_ref_id);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ref_id);
                v.setMaxLength(255);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_guid);
                ai.setJavaName(ATTR_guid);
                ai.setColumnName(ATTR_guid);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_guid);
                v.setMaxLength(31);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public tbl_state_provBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getId()
    {
        return getIntProperty(ATTR_id);
    }

    public void setId(int value)
    {
        setProperty(ATTR_id, value, 0);
    }

    public String getName()
    {
        return getStringProperty(ATTR_name);
    }

    public void setName(String value)
    {
        setProperty(ATTR_name, value, 0);
    }

    public String getFull_name()
    {
        return getStringProperty(ATTR_full_name);
    }

    public void setFull_name(String value)
    {
        setProperty(ATTR_full_name, value, 0);
    }

    public int getCode()
    {
        return getIntProperty(ATTR_code);
    }

    public void setCode(int value)
    {
        setProperty(ATTR_code, value, 0);
    }

    public int getIs_default()
    {
        return getIntProperty(ATTR_is_default);
    }

    public void setIs_default(int value)
    {
        setProperty(ATTR_is_default, value, 0);
    }

    public int getDev()
    {
        return getIntProperty(ATTR_dev);
    }

    public void setDev(int value)
    {
        setProperty(ATTR_dev, value, 0);
    }

    public int getDisplay_order()
    {
        return getIntProperty(ATTR_display_order);
    }

    public void setDisplay_order(int value)
    {
        setProperty(ATTR_display_order, value, 0);
    }

    public String getState_numeric_code()
    {
        return getStringProperty(ATTR_state_numeric_code);
    }

    public void setState_numeric_code(String value)
    {
        setProperty(ATTR_state_numeric_code, value, 0);
    }

    public int getState_prov2country()
    {
        return getIntProperty(ATTR_state_prov2country);
    }

    public void setState_prov2country(int value)
    {
        setProperty(ATTR_state_prov2country, value, 0);
    }

    public String getRef_id()
    {
        return getStringProperty(ATTR_ref_id);
    }

    public void setRef_id(String value)
    {
        setProperty(ATTR_ref_id, value, 0);
    }

    public String getGuid()
    {
        return getStringProperty(ATTR_guid);
    }

    public void setGuid(String value)
    {
        setProperty(ATTR_guid, value, 0);
    }

    public static BusObjectIterator<com.cica.uw.tbl_state_prov> getTbl_state_provObjects(com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"tbl_state_prov\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_state_prov.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.tbl_state_prov> getTbl_state_provObjects()
    {
        String queryText = "select * from \"tbl_state_prov\"";
        QueryObject query = new QueryObject(queryText);
        query.setResultClass(tbl_state_prov.class);
        return query.getObjects();
    }

}
