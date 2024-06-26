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


public abstract class ProductJruleMasterBase extends com.cordys.cpc.bsf.busobject.StateBusObject
{
    // tags used in the XML document
    public final static String ATTR_Id = "Id";
    public final static String ATTR_Product = "Product";
    public final static String ATTR_ProductDescription = "ProductDescription";
    public final static String ATTR_Jrule = "Jrule";
    public final static String ATTR_JruleDescription = "JruleDescription";
    public final static String ATTR_Created_Date = "Created_Date";
    public final static String ATTR_Created_By = "Created_By";
    public final static String ATTR_CompanyCode = "CompanyCode";
    public final static String ATTR_COX_Indicator = "COX_Indicator";
    private static ClassInfo s_classInfo = null;
    public static ClassInfo _getClassInfo()//NOPMD framework ensures this is thread safe
    {
        if ( s_classInfo == null )//NOPMD
        {
            s_classInfo = newClassInfo(ProductJruleMaster.class);
            s_classInfo.setTableName("ProductJruleMaster");
            s_classInfo.setUIDElements(new String[]{ATTR_Id});
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Id);
                ai.setJavaName(ATTR_Id);
                ai.setColumnName(ATTR_Id);
                ai.setAttributeClass(int.class);
                NumberValidator v = new NumberValidator(ATTR_Id);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Product);
                ai.setJavaName(ATTR_Product);
                ai.setColumnName(ATTR_Product);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Product);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_ProductDescription);
                ai.setJavaName(ATTR_ProductDescription);
                ai.setColumnName(ATTR_ProductDescription);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_ProductDescription);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Jrule);
                ai.setJavaName(ATTR_Jrule);
                ai.setColumnName(ATTR_Jrule);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Jrule);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_JruleDescription);
                ai.setJavaName(ATTR_JruleDescription);
                ai.setColumnName(ATTR_JruleDescription);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_JruleDescription);
                v.setMaxLength(100);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Created_Date);
                ai.setJavaName(ATTR_Created_Date);
                ai.setColumnName(ATTR_Created_Date);
                ai.setAttributeClass(java.util.Date.class);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_Created_By);
                ai.setJavaName(ATTR_Created_By);
                ai.setColumnName(ATTR_Created_By);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_Created_By);
                v.setMaxLength(20);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_CompanyCode);
                ai.setJavaName(ATTR_CompanyCode);
                ai.setColumnName(ATTR_CompanyCode);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_CompanyCode);
                v.setMaxLength(10);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
            {
                AttributeInfo ai = new AttributeInfo(ATTR_COX_Indicator);
                ai.setJavaName(ATTR_COX_Indicator);
                ai.setColumnName(ATTR_COX_Indicator);
                ai.setAttributeClass(String.class);
                StringValidator v = new StringValidator(ATTR_COX_Indicator);
                v.setMaxLength(5);
                ai.addConstraintHandler(v);
                s_classInfo.addAttributeInfo(ai);
            }
        }
        return s_classInfo;
    }

    public ProductJruleMasterBase(BusObjectConfig config)
    {
        super(config);
    }

    public int getId()
    {
        return getIntProperty(ATTR_Id);
    }

    public void setId(int value)
    {
        setProperty(ATTR_Id, value, 0);
    }

    public String getProduct()
    {
        return getStringProperty(ATTR_Product);
    }

    public void setProduct(String value)
    {
        setProperty(ATTR_Product, value, 0);
    }

    public String getProductDescription()
    {
        return getStringProperty(ATTR_ProductDescription);
    }

    public void setProductDescription(String value)
    {
        setProperty(ATTR_ProductDescription, value, 0);
    }

    public String getJrule()
    {
        return getStringProperty(ATTR_Jrule);
    }

    public void setJrule(String value)
    {
        setProperty(ATTR_Jrule, value, 0);
    }

    public String getJruleDescription()
    {
        return getStringProperty(ATTR_JruleDescription);
    }

    public void setJruleDescription(String value)
    {
        setProperty(ATTR_JruleDescription, value, 0);
    }

    public java.util.Date getCreated_Date()
    {
        return getDateTimestampProperty(ATTR_Created_Date);
    }

    public void setCreated_Date(java.util.Date value)
    {
        setProperty(ATTR_Created_Date, value, 0);
    }

    public String getCreated_By()
    {
        return getStringProperty(ATTR_Created_By);
    }

    public void setCreated_By(String value)
    {
        setProperty(ATTR_Created_By, value, 0);
    }

    public String getCompanyCode()
    {
        return getStringProperty(ATTR_CompanyCode);
    }

    public void setCompanyCode(String value)
    {
        setProperty(ATTR_CompanyCode, value, 0);
    }

    public String getCOX_Indicator()
    {
        return getStringProperty(ATTR_COX_Indicator);
    }

    public void setCOX_Indicator(String value)
    {
        setProperty(ATTR_COX_Indicator, value, 0);
    }


    public static BusObjectIterator<com.cica.uw.ProductJruleMaster> getNextProductJruleMasterObjects(int Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"ProductJruleMaster\" where (\"Id\" > :Id) order by \"Id\" asc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "ProductJruleMaster.Id", QueryObject.PARAM_INT, new Integer(Id));//NOPMD
        query.setResultClass(ProductJruleMaster.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.ProductJruleMaster> getPreviousProductJruleMasterObjects(int Id, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"ProductJruleMaster\" where (\"Id\" < :Id) order by \"Id\" desc";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "ProductJruleMaster.Id", QueryObject.PARAM_INT, new Integer(Id));//NOPMD
        query.setResultClass(ProductJruleMaster.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static com.cica.uw.ProductJruleMaster getProductJruleMasterObject(int Id)
    {
        String queryText = "select * from \"ProductJruleMaster\" where \"Id\" = :Id";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("Id", "ProductJruleMaster.Id", QueryObject.PARAM_INT, new Integer(Id));//NOPMD
        query.setResultClass(ProductJruleMaster.class);
        return (ProductJruleMaster)query.getObject();
    }

    public static BusObjectIterator<com.cica.uw.ProductJruleMaster> getProductJruleMasterObjects(int fromId, int toId, com.cordys.cpc.bsf.query.Cursor cursor)
    {
        String queryText = "select * from \"ProductJruleMaster\" where \"Id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "ProductJruleMaster.Id", QueryObject.PARAM_INT, new Integer(fromId));
        query.addParameter("toId", "ProductJruleMaster.Id", QueryObject.PARAM_INT, new Integer(toId));
        query.setResultClass(ProductJruleMaster.class);
        query.setCursor(cursor);
        return query.getObjects();
    }

    public static BusObjectIterator<com.cica.uw.ProductJruleMaster> getProductJruleMasterObjects(int fromId, int toId)
    {
        String queryText = "select * from \"ProductJruleMaster\" where \"Id\" between :fromId and :toId";
        QueryObject query = new QueryObject(queryText);
        query.addParameter("fromId", "ProductJruleMaster.Id", QueryObject.PARAM_INT, new Integer(fromId));
        query.addParameter("toId", "ProductJruleMaster.Id", QueryObject.PARAM_INT, new Integer(toId));
        query.setResultClass(ProductJruleMaster.class);
        return query.getObjects();
    }


}
