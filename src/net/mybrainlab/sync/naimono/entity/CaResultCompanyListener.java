package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class CaResultCompanyListener implements EntityListener<CaResultCompany> {

    @Override
    public void preInsert(CaResultCompany entity, PreInsertContext<CaResultCompany> context) {
    }

    @Override
    public void preUpdate(CaResultCompany entity, PreUpdateContext<CaResultCompany> context) {
    }

    @Override
    public void preDelete(CaResultCompany entity, PreDeleteContext<CaResultCompany> context) {
    }

    @Override
    public void postInsert(CaResultCompany entity, PostInsertContext<CaResultCompany> context) {
    }

    @Override
    public void postUpdate(CaResultCompany entity, PostUpdateContext<CaResultCompany> context) {
    }

    @Override
    public void postDelete(CaResultCompany entity, PostDeleteContext<CaResultCompany> context) {
    }
}