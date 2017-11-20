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
public class QAListener implements EntityListener<QA> {

    @Override
    public void preInsert(QA entity, PreInsertContext<QA> context) {
    }

    @Override
    public void preUpdate(QA entity, PreUpdateContext<QA> context) {
    }

    @Override
    public void preDelete(QA entity, PreDeleteContext<QA> context) {
    }

    @Override
    public void postInsert(QA entity, PostInsertContext<QA> context) {
    }

    @Override
    public void postUpdate(QA entity, PostUpdateContext<QA> context) {
    }

    @Override
    public void postDelete(QA entity, PostDeleteContext<QA> context) {
    }
}