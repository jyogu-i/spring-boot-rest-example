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
public class TimingListener implements EntityListener<Timing> {

    @Override
    public void preInsert(Timing entity, PreInsertContext<Timing> context) {
    }

    @Override
    public void preUpdate(Timing entity, PreUpdateContext<Timing> context) {
    }

    @Override
    public void preDelete(Timing entity, PreDeleteContext<Timing> context) {
    }

    @Override
    public void postInsert(Timing entity, PostInsertContext<Timing> context) {
    }

    @Override
    public void postUpdate(Timing entity, PostUpdateContext<Timing> context) {
    }

    @Override
    public void postDelete(Timing entity, PostDeleteContext<Timing> context) {
    }
}