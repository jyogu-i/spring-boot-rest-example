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
public class CaResultIndustryListener implements EntityListener<CaResultIndustry> {

    @Override
    public void preInsert(CaResultIndustry entity, PreInsertContext<CaResultIndustry> context) {
    }

    @Override
    public void preUpdate(CaResultIndustry entity, PreUpdateContext<CaResultIndustry> context) {
    }

    @Override
    public void preDelete(CaResultIndustry entity, PreDeleteContext<CaResultIndustry> context) {
    }

    @Override
    public void postInsert(CaResultIndustry entity, PostInsertContext<CaResultIndustry> context) {
    }

    @Override
    public void postUpdate(CaResultIndustry entity, PostUpdateContext<CaResultIndustry> context) {
    }

    @Override
    public void postDelete(CaResultIndustry entity, PostDeleteContext<CaResultIndustry> context) {
    }
}