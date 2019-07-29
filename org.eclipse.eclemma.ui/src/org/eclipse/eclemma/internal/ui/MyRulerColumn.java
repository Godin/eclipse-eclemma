package org.eclipse.eclemma.internal.ui;

import org.eclipse.jface.text.source.AbstractRulerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.rulers.IContributedRulerColumn;
import org.eclipse.ui.texteditor.rulers.RulerColumnDescriptor;

/**
 * TODO
 */
public class MyRulerColumn extends AbstractRulerColumn
    implements IContributedRulerColumn {

  public MyRulerColumn() {
    setWidth(6);
  }

  private RulerColumnDescriptor descriptor;

  public RulerColumnDescriptor getDescriptor() {
    // TODO Auto-generated method stub
    return descriptor;
  }

  public void setDescriptor(RulerColumnDescriptor descriptor) {
    // TODO Auto-generated method stub
    this.descriptor = descriptor;
  }

  private ITextEditor editor;

  public void setEditor(ITextEditor editor) {
    // TODO Auto-generated method stub
    this.editor = editor;
  }

  public ITextEditor getEditor() {
    // TODO Auto-generated method stub
    return editor;
  }

  public void columnCreated() {
    // TODO Auto-generated method stub
  }

  public void columnRemoved() {
    // TODO Auto-generated method stub
  }

  @Override
  protected Color computeBackground(int line) {
    // TODO Auto-generated method stub
    return Display.getDefault().getSystemColor(SWT.COLOR_BLACK);
  }

}
