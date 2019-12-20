import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ApprovedcibillistComponent } from './approvedcibillist.component';

describe('ApprovedcibillistComponent', () => {
  let component: ApprovedcibillistComponent;
  let fixture: ComponentFixture<ApprovedcibillistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ApprovedcibillistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ApprovedcibillistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
