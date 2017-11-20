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
public class TermListener implements EntityListener<Term> {

    @Override
    public void preInsert(Term entity, PreInsertContext<Term> context) {
    }

    @Override
    public void preUpdate(Term entity, PreUpdateContext<Term> context) {
    }

    @Override
    public void preDelete(Term entity, PreDeleteContext<Term> context) {
    }

    @Override
    public void postInsert(Term entity, PostInsertContext<Term> context) {
    }

    @Override
    public void postUpdate(Term entity, PostUpdateContext<Term> context) {
    }

    @Override
    public void postDelete(Term entity, PostDeleteContext<Term> context) {
    }
}