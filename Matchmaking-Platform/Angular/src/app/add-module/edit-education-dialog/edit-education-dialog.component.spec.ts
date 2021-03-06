import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditEducationDialogComponent } from './edit-education-dialog.component';

describe('EditEducationDialogComponent', () => {
  let component: EditEducationDialogComponent;
  let fixture: ComponentFixture<EditEducationDialogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditEducationDialogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditEducationDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
